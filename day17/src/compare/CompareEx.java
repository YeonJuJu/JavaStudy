package compare;


public class CompareEx {
    public static void main(String[] args){
        int result = Compare.compare(new Integer(111), new Integer(222));

        System.out.println("result :: " + result);

        result = Compare.compare(new Double(12.34), new Double(12.33));

        System.out.println("result :: " + result);

        // Number 타입이 아닌 String 타입을 집어 넣으면 오류가 발생
        // result = Compare.compare(new String("tiger"), new String("lion"));

        // The method compare(T, T) in the type Compare
        // is not applicable for the arguments (String, String)
        // result = Compare.compare(new String("tiger"), new String("lion"));
        // System.out.printf("result : %d%n", result);

        // The method compare(T, T) in the type Compare
        // is not applicable for the arguments (Object, Object)
        // result = Compare.compare(new Object(), new Object());
    }
}
