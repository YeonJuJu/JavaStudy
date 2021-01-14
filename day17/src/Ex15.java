
enum Direction { EAST, WEST, SOUTH, NORTH }

public class Ex15 {
    public static void main(String[] args){
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");
        // ㄴ 객체를 새로 생성하는 것이 아닌, 기존의 객체를 가져오는 것.

        System.out.println("d1 : " + d1);
        System.out.println("d1 : " + d2);
        System.out.println("d1 : " + d3);

        System.out.println(d1 == d2);       //false
        System.out.println(d1 == d3);       //true
        System.out.println(d1.equals(d3));  //true

        System.out.println(d1.compareTo(d3));   //true
        System.out.println(d1.compareTo(d2));   //false

        Direction[] arrDirection = Direction.values();
        for(Direction d : arrDirection){
            System.out.println(d.name() + " : " + d.ordinal());
        }
    }
}
