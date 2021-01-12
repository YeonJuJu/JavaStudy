import java.util.HashMap;

public class Ex17 {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        map.put(new String("해리"), new Integer(95));
        map.put(new String("헤르미온느"), 100);
        map.put(new String("론"), 85);
        map.put(new String("드레이코"), 92);
        map.put(new String("네빌"), 70);

        //map 은 key 로 value 를 찾는다.
        Integer score = map.get("해리");
        System.out.println("해리의 점수는 " + score + " 점입니다.");
        System.out.println("네빌의 점수는 " + map.get("네빌") + " 점입니다.");

    }
}
