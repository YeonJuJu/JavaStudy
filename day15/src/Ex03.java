public class Ex03 {
    public static void main(String[] args){
        //원본이 변하지 않는다 -> immutable
        String str1 = new String("java");
        String str2 = str1 + " python";
        String str3 = "java";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        //복사본을 수정해도 원본이 변한다 -> mutable
        // (새로 만드는게 아니므로 메모리 절약)
        StringBuffer sb1 = new StringBuffer("java");
        System.out.println(sb1);
        StringBuffer sb2 = sb1;
        sb2.append(" python");
        System.out.println(sb1);

        sb2 = new StringBuffer("java");

        System.out.println("=====================");
        System.out.println(str1.equals(str2));          //false
        System.out.println(str1.equals(str3));          //true
        System.out.println(str1.equals(sb2));           //false
        // |-> str1 은 String 이면서 "java" 이므로 true 가 나오려면
        // sb2 도 그래야한다 하지만 sb2는 StringBuffer 이면서 "java"이므로
        // false 이다.
        // data 의 내용만 비교하기 위해서는 .contentEquals() 함수를 이용한다.
        System.out.println(str1.contentEquals(sb2));    //true
        System.out.println("=====================");



    }
}
