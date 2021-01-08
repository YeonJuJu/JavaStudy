//.equals -> 전달되는 객체의 value 비교

public class Ex10 {
    public static void main(String[] args){
        // 주소가 저장되어 있음
        String str1 = "abc";
        String str2 = "abc";

        String str3 = new String("abc");
        String str4 = new String("abc");

        //str1, str2는 데이터 공간의 효율을 위해 동일한 문자열의 주소를 가리킴
        System.out.println("str1 == str2 : " + (str1==str2));

        //str3, str4는 새로운 메모리에 동일한 문자열을 추가하였으므로 다른 주소를 가리킴
        System.out.println("str3 == str4 : " + (str3==str4));

        //하지만 str2를 바꾸면 새로운 메모리에 문자열을 저장하므로 str1은 바뀌지 않음
        str2 = "cba";
        System.out.println("str1 : " + str1 + ", str2 : " + str2);

        //문자열의 내용을 비교하는 방법은 .equals 사용
        System.out.println("str1 == str3 : " + str1.equals(str3));


        A a1 = new A();
        A a2 = new A();

        //다음은 둘 다 주소로 비교하기 때문에 false가 나온다.
        //값으로 비교하기 위해서는 equals함수를 오버라이딩해야한다.
        System.out.println("a1 == a2 : " + a1.equals(a2));
        System.out.println("a1 == a2 : " + (a1==a2));
    }
}

class A extends Object{

    //다음은 equals 함수의 기본형
   @Override
    public boolean equals(Object obj){
       return super.equals(obj);
   }
}