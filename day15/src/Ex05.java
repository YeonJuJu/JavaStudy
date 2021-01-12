import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex05 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<5;i++){
            list.add((i+1) + "");
        }
        System.out.println(list);
        System.out.println("========================");

        Iterator iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n========================");


        ListIterator listIterator = list.listIterator();

        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println("\n========================");

        //얘는 뒤에서부터 옴. 커서 앞에 데이터가 있는 형식
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
        System.out.println("\n========================");

    }
}
