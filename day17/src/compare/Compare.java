package compare;

/*
    <T extends Number>  : T의 상위 클래스 제한
                          부모 type 을 Number class 로 제한함
                          T class 는 Number class 를 상속받는 class 만 가능

*/
public class Compare {
    public static <T extends Number> int compare(T t1, T t2){
        double d1 = t1.doubleValue();
        double d2 = t2.doubleValue();

        return Double.compare(d1, d2);
    }
}
