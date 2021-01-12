import java.util.*;

public class Ex10 {
    public static void main(String[] args){
        Set set = new HashSet<>();

        for(int i=0;set.size() < 6;i++){
            //number = 1 ~ 45
            int number = (int)(Math.random()*45 + 1);
            set.add(number);
        }
        System.out.println("set : " + set);

        //set 은 index 가 없기 때문에 set 자체로 정렬이 불가능하다.
        //따라서 list 로 형식을 변환하여 sort 함수를 사용해 정렬한다.
        List list = new LinkedList<>(set);
        Collections.sort(list);
        System.out.println("list : " + list);
    }
}
