enum Transportation{
    BUS(100){
        int fare(int distance){
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150){
        int fare(int distance){
            return distance * BASIC_FARE;
        }
    },
    SHIP(100){
        int fare(int distance){
            return distance * BASIC_FARE;
        }
    },
    AIRPLANE(300){
        int fare(int distance){
            return distance * BASIC_FARE;
        }
    };


    protected final int BASIC_FARE;
    private Transportation(int basicFare){
        this.BASIC_FARE = basicFare;
    }

    public int getBasicFare(){
        return BASIC_FARE;
    }

    //거리에 따른 요금 계산
    abstract int fare(int distance);
}

public class Ex01 {
    static int number = 100;
    static float numberFloat = 34.56f;
    double numberDouble = 32.65;

    public static void main(String[] args){
        System.out.println("bus fare    : " + Transportation.BUS.fare(number));
        System.out.println("train fare    : " + Transportation.TRAIN.fare((int) numberFloat));
        System.out.println("ship fare    : " + Transportation.SHIP.fare(100));
        System.out.println("airplane fare    : " + Transportation.AIRPLANE.fare(100));

    }
}
