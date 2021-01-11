import java.util.ArrayList;
import java.util.Collections;

public class Ex07 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(new Integer(5));
        list.add(4);
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(3);

        System.out.println(list);

        //ArrayList slicing -> .sublist(a, b) -> a <= x < 4
        ArrayList subList = new ArrayList<>(list.subList(1, 4));

        printList(list, subList);

        //다음은 정렬하는 함수
        Collections.sort(list);
        Collections.sort(subList);

        //sublist
        System.out.println("list contains all sublist : " + list.containsAll(subList));

        subList.add("B");
        subList.add("C");
        printList(list, subList);

        subList.add(3, "A");
        printList(list, subList);

        subList.add(3, "AA");
        printList(list, subList);

        // retainAll() - 공통 요소만 남기고 나머지는 삭제함
        System.out.println("list1.retainAll(list2) : " + list.retainAll(subList));
        printList(list, subList);

        // list2에서 list1에 포함된 객체(data)들 삭제하기
        for(int i = subList.size()-1; i >= 0; i--) {
            if(list.contains(subList.get(i))) {
                subList.remove(i);
            }
        }
        printList(list, subList);

    }

    public static void printList(ArrayList list1, ArrayList list2){
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
    }
}
