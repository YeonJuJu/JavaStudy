import java.util.TreeSet;

public class Ex14 {
    public static void main(String[] args){
        TreeSet set = new TreeSet<>();

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("disc");
        set.add("dance");
        set.add("dZZZZ");
        set.add("dzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("fan");
        set.add("flower");

        String from = "b";
        String to = "d";

        System.out.println(set);
        System.out.println("range search : from " + from + " to " + to);
        //set.subset(from, to) -> from 으로 시작하는 것 부터 to 로 시작하는거 직전까지
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));

    }
}
