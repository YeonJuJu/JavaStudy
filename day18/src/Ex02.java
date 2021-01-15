import java.util.Comparator;

abstract class EnumTest<T extends EnumTest<T>> implements Comparable<T> {
    static int id = 0;
    int ordinal;
    String name = "";

    public int ordinal() {
        return ordinal;
    }

    public EnumTest(String name){
        this.name = name;
        this.ordinal = id++;
    }

    @Override
    public int compareTo(T t){
        return this.ordinal = t.ordinal;
    }
}
abstract class TransportationTest extends EnumTest{

    // anonymous class (익명 클래스)
    static final TransportationTest BUS = new TransportationTest("BUS", 100) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final TransportationTest TRAIN = new TransportationTest("TRAIN", 150) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final TransportationTest SHIP = new TransportationTest("SHIP", 150) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    static final TransportationTest AIRPLANE = new TransportationTest("AIRPLANE", 300) {
        @Override
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };

    protected  final int BASIC_FARE;
    abstract int fare(int distance);

    private TransportationTest(String name, int basicFare){
        super(name);
        BASIC_FARE = basicFare;
    }

    public String name() {
        return this.name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

public class Ex02 {
    public static void main(String[] args){
        //객체를 새로 만드는 것이 아닌, 기존에 생성된 객체를 가져오는 것
        Transportation t1 = Transportation.BUS;
        Transportation t2 = Transportation.TRAIN;
        Transportation t3 = Transportation.SHIP;
        Transportation t4 = Transportation.AIRPLANE;

        System.out.printf("t1 : %s, %d\n", t1.name(), t1.ordinal());
        System.out.printf("t2 : %s, %d\n", t2.name(), t2.ordinal());
        System.out.printf("t3 : %s, %d\n", t3.name(), t3.ordinal());
        System.out.printf("t4 : %s, %d\n", t4.name(), t4.ordinal());

    }
}
