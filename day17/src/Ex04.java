

/*
    Generic
        ㄴ 클래스 안에서 사용하는 변수의 type 을
           클래스를 작성하는 시점이 아닌,
           객체를 생성하는 시점에서 결정하여 사용하는 문법

           클래스의 변수(멤버변수, 지역변수)의 type 을
           객체가 생성될 때 결정하게 되므로
           같은 클래스를 가지고 여러가지 type 의
           변수들을 지정해서 사용할 수 있다
*/
public class Ex04 {
    public static void main(String[] args){
        Test<Integer> t1 = new Test<>();
        t1.num1 = 111;
        t1.testMethod(222);

        System.out.println("==================");

        Test<String> t2 = new Test<>();
        t2.num1 = "This is String type";
        t2.testMethod("Hello, Java!");

        System.out.println("==================");

        Test t3 = new Test<>();
        t3.num1 = 111;
        t3.testMethod(222);
        t3.num1 = "This is String type";
        t3.testMethod("Hello, Java!");
    }
}

//class Test{
//    int num1;
//    public void testMethod(int num2){
//        System.out.println("num1 : " + num1);
//        System.out.println("num2 : " + num2);
//    }
//}

class Test<T>{
    T num1;
    public void testMethod(T num2){
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }
}
