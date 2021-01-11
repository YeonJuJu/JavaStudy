import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex09 {
    public static void main(String[] args){
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        //순차적으로 추가
        System.out.println("===순차적으로 추가하기===");
        System.out.println("ArrayList : " + add1(al));
        System.out.println("LinkedList : " + add1(ll));

        //무작위로 추가
        System.out.println("===무작위로 추가하기===");
        System.out.println("ArrayList : " + add2(al));
        System.out.println("LinkedList : " + add2(ll));

        //순차적으로 삭제
        System.out.println("===순차적으로 삭제하기===");
        System.out.println("ArrayList : " + remove1(al));
        System.out.println("LinkedList : " + remove1(ll));

        //무작위로 삭제
        System.out.println("===무작위로 삭제하기===");
        System.out.println("ArrayList : " + remove2(al));
        System.out.println("LinkedList : " + remove2(ll));
    }

    //parameter 를 조상 type (List type) 으로 하여
    //ArrayList, LinkedList 모두 인자로 넣을 수 있도록 함
    public static long add1(List list){
        //현재 PC 시간
        long start = System.currentTimeMillis();

        //작업
        for(int i=0;i<10000;i++){
            list.add(i+"");
        }

        //끝난 시간
        long end = System.currentTimeMillis();

        //소요시간
        return end - start;
    }

    public static long add2(List list){
        //현재 PC 시간
        long start = System.currentTimeMillis();

        //작업
        for(int i=0;i<10000;i++){
            list.add(500,"X");
        }

        //끝난 시간
        long end = System.currentTimeMillis();

        //소요시간
        return end - start;
    }

    public static long remove1(List list){
        //현재 PC 시간
        long start = System.currentTimeMillis();

        //작업
        for(int i= list.size()-1 ;i>=0;i--){
            list.remove(i);
        }

        //끝난 시간
        long end = System.currentTimeMillis();

        //소요시간
        return end - start;
    }

    public static long remove2(List list){
        //현재 PC 시간
        long start = System.currentTimeMillis();

        //작업
        for(int i=0 ;i<list.size();i++){
            list.remove(i);
        }

        //끝난 시간
        long end = System.currentTimeMillis();

        //소요시간
        return end - start;
    }
}
