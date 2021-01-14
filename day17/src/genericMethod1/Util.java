package genericMethod1;

public class Util {
    public static <T> Person<T> change(T t){
        Person<T> p = new Person<>();
        p.setT(t);
        return p;
    }
}
