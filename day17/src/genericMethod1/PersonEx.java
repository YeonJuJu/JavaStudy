package genericMethod1;

public class PersonEx {
    public static void main(String[] args){
        Person<Integer> p1 = Util.change(new Integer(1997));
        int birth = p1.getT();
        System.out.println("number : " + birth);

        Person<String> p2 = Util.change(new String("jungkook"));
        String name = p2.getT();
        System.out.println("name : " + name);
    }
}
