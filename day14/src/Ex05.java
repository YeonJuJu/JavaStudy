import java.util.ArrayList;

public class Ex05 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        //ArrayList 삽입
        list.add("과자");
        list.add("스낵");
        list.add("쿠키");

        System.out.println(list);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n=======================");

        list.add(2, "초콜렛");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n=======================");

        list.add(1, "사탕");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n=======================");

        //ArrayList 수정
        list.set(0, "젤리");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n=======================");

        //ArrayList 삭제
        list.remove("스낵");
        list.set(0, "젤리");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n=======================");

        list.remove(1);
        list.set(0, "젤리");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n=======================");

        //중복 삽입 가능
        list.add("초콜렛");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n=======================");

        //인덱스 뽑아내기
        // -> 중복된 data 가 있을 경우
        // 그 중 .indexOf는 제일 앞 데이터의 인덱스 출력
        int index1 = list.indexOf("초콜렛");
        System.out.println("첫번째 초콜렛 인덱스 : " +index1);

        //.lastIndexOf 는 그 중 제일 마지막 데이터의 인덱스 출력
        int index2 = list.lastIndexOf("초콜렛");
        System.out.println("마지막 초콜렛 인덱스 : " +index2);
    }
}
