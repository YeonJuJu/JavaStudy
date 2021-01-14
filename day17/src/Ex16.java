
enum Direction2{
    EAST(1, ">"),  SOUTH(2, "V"), WEST(3, "<"), NORTH(4,"^");

    private static final Direction2[] ARR_DIR = Direction2.values();
    private final int value;
    private final String symbol;

    private Direction2(int value, String symbol){
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue(){
        return this.value;
    }

    public String getSymbol(){
        return this.symbol;
    }

    @Override
    public String toString(){
        return name() + " -- " + getSymbol() + " , " + getValue();
    }

    public static Direction2 of(int dir){
        if(dir < 1  || dir > 4){
            throw new IllegalArgumentException("Invalid value : " + dir);
        }
        return ARR_DIR[dir -1];
    }

    public Direction2 rotate(int num){
        num = num%4;
        if(num < 0){
            num += 4;
        }
        return ARR_DIR[(value -1 + num) % 4];
    }
}

public class Ex16 {
    public static void main(String[] args){
        for(Direction2 d : Direction2.values()){
            System.out.println(d.name() + " : " + d.ordinal());
        }

        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);

        //둘이 같은 결과를 보여줌
        System.out.println("d1 : " + d1.name() + " , " + d1.getValue());
        System.out.println("d2 : " + d2.name() + " , " + d2.getValue());

        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(2));
    }
}
