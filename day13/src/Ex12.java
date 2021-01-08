public class Ex12 {
    public static void main(String[] args){
        char[] arrC = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println("arrC : " + arrC); // 해당 출력은 arrC의 진짜 값인 주소값이 나온다.
        System.out.println(arrC); // 해당 출력은 저장한 문자들이 나온다.
        String str = new String(arrC);
        System.out.println(str);

        //길이가 0인 배열 생성
        char[] arrChar1 = new char[0];

        String s1 = new String(arrChar1);
        System.out.println("s1 : " + s1);
        String s2 = new String("");
        System.out.println("s2 : " + s2);

        System.out.println("arrChar1.length : " + arrChar1.length);

        System.out.println("hello" + s1 + "java");

    }
}
