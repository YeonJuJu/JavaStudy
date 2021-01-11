import java.util.LinkedList;

public class Ex11 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.offer("토끼");
        queue.offer("사슴");
        queue.offer("호랑이");

        System.out.println(queue);
        System.out.println("============");

        //.peek() -> head 에 있는 데이터 확인
        //.poll() -> head 에 있는 데이터 꺼내오기
        while (!queue.isEmpty()) {
            String animal = queue.poll();
            System.out.println("animal : " + animal);
            System.out.println(queue);
            System.out.println("============");
        }

        //.retainAll(obj) -> 교집합 외에 차집합 삭제


    }
}
