package inheritance;

import java.util.Arrays;

public class ProductEx {
    public static void main(String[] args){
        ChildProduct<Tv, String, String> p1 = new ChildProduct<>();
        p1.setKind(new Tv());
        p1.setModel("Smart TV");
        p1.setCompany("Samsung");

        System.out.println(p1.getKind() + " : " + p1.getModel() + " : " + p1.getCompany());

        Storage<Tv> strg = new StorageImpl<Tv>(3);
        strg.add(new Tv(), 0);
        strg.add(new Tv("엘지 TV"), 1);
        strg.add(new Tv("삼성 TV"), 2);

        System.out.println(strg.getT(0) + " : " + Arrays.toString(strg.getT()));

        strg.add(new Tv("스마트 TV"), 0);
        System.out.println(strg.getT(0) + " : " + Arrays.toString(strg.getT()));

    }
}
