
enum ShoesType {WALKING, RUNNING, TRACKING, HIKING}

public class Ex13 {
    public String name;
    public int size;
    public ShoesType type;

    public static void main(String[] args){
        Ex13 ex = new Ex13();
        ex.name = "프로스펙스";
        ex.size = 280;
        ex.type = ShoesType.RUNNING;

        System.out.println("브랜드 : " + ex.name);
        System.out.println("사이즈 : " + ex.size);
        System.out.println("종  류 : " + ex.type);

        //다음은 1 출력. RUNNING은 인덱스가 1이니까~
        System.out.println("ex.type.ordinal() : " + ex.type.ordinal());

        ShoesType st1 = ShoesType.WALKING;
        ShoesType st2 = ShoesType.WALKING;

    }
}
