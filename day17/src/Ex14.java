
// enum 클래스 커스터마이징

enum ShoesType2 {
    WALKING("워킹화"), RUNNING("러닝화"), TRACKING("트래킹화"), HIKING("하이킹화");

    private String name;
    private ShoesType2(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    public String getName(){
        return name;
    }
}

public class Ex14 {
    public static void main(String[] args){
        for(ShoesType2 st : ShoesType2.values()){
            System.out.println(st.getName());
        }
    }
}
