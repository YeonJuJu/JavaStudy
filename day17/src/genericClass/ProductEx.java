package genericClass;

public class ProductEx {
    public static void main(String[] args){
        Product<Tv, String> p1 = new Product<>();

        p1.setT(new Tv(2021, 1));
        p1.setM(new String("LG TV"));

        Tv tv = p1.getT();
        System.out.println("p1.t.year : " + tv.getYear());
        System.out.println("p1.t.month : " + tv.getMonth());
        System.out.println("p1.name : " + p1.getM());

        System.out.println("=================================");

        Product<Car, String> p2 = new Product<>();

        p2.setT(new Car("auto",2021, 1));
        p2.setM(new String("Hyundae Car"));

        Car car = p2.getT();
        System.out.println("p2.t.manufacture : " + car.getManufacture());
        System.out.println("p2.t.year : " + car.getYear());
        System.out.println("p2.t.month : " + car.getMonth());
        System.out.println("p2.name : " + p2.getM());

        System.out.println("=================================");

        //p2의 car 내용 변경
        p2.getT().setYear(2019);
        p2.getT().setMonth(7);
        p2.setM("기아 k5");

        System.out.println("p2.t.manufacture : " + car.getManufacture());
        System.out.println("p2.t.year : " + car.getYear());
        System.out.println("p2.t.month : " + car.getMonth());
        System.out.println("p2.name : " + p2.getM());

        System.out.println("=================================");

        System.out.println("우리집 자동차는 " + p2.getT().getYear() +"년, " + p2.getT().getMonth() + "월에 생산된 " + p2.getM() + "입니다.");
    }
}
