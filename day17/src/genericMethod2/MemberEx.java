package genericMethod2;

public class MemberEx {
    public static void main(String[] args){
        MemberEx ex = new MemberEx();
        Member<Integer> memInt = ex.boxing(222);
        System.out.println("memberInt's t : " + memInt.getT());

        Member<String> memInt2 = ex.boxing("Hello");
        System.out.println("memberInt's t : " + memInt2.getT());
    }
    //public (generic 사용 명시) (리턴값) 함수이름(매개변수)
    public <T> Member<T> boxing(T t){
        Member<T> m = new Member<>();
        m.setT(t);
        return m;
    }
}
