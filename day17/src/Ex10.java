/*
    enum (enumeration) : 열거형

    클래스의 한 종류 : 생성자, 멤버변수, 멤버 메소드

    static final 멤버변수 <-- 자신 클래스 타입의 참조변수

    일반 클래스와 같이 독립적으로 정의할 수 있음
    다른 클래스 내부에 정의할 수 있음 (inner class)

 */

enum Size2 { SMALL, MEDIUM, LARGE }

// enum 을 직접 만들어보자
class Size{
    static final Size SMALL = new Size("SMALL");
    static final Size MEDIUM = new Size("MEDIUM");
    static final Size LARGE = new Size("LARGE");

    private String name;

    private Size(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

public class Ex10 {
    public static void main(String[] args){
        System.out.println("Size.SMALL : " + Size.SMALL);
        System.out.println("Size2.SMALL : " + Size2.SMALL);
    }
}
