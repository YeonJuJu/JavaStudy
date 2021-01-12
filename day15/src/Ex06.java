import java.util.ArrayList;
import java.util.Iterator;

public class Ex06 {
    public static void main(String[] args){
        ArrayList<String> original = new ArrayList<>(10);
        ArrayList<String> copy1 = new ArrayList<>(10);
        ArrayList<String> copy2 = new ArrayList<>(10);

        for(int i=0;i<10;i++){
            original.add(i + "");
        }

        //Iterator 형식 지정 가능
        Iterator<String> iterator = original.iterator();

        //복사 : 원본과 복사본은 독립적
        while(iterator.hasNext()){
            copy1.add(iterator.next());
        }

        System.out.println("original -> copy1");
        System.out.println("original : " + original);
        System.out.println("copy1    : " + copy1);


        //이동 : 원본에 있는 데이터를 삭제하면서 복사본으로 옮김
        iterator = original.iterator();

        while(iterator.hasNext()){
            copy2.add(iterator.next());
            //iterator.remove() 는 원본에 있는 데이터 삭제
            iterator.remove();
        }

        System.out.println("original -> copy2");
        System.out.println("original : " + original);
        System.out.println("copy2    : " + copy2);
    }
}
