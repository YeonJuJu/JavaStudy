import java.util.Set;
import java.util.TreeSet;

public class Ex15 {
    public static void main(String[] args){
        Set set = new TreeSet();

        //트리 구조로 저장되기 때문에 자동으로 정렬됨.
        for(int i=0;set.size() < 6;i++){
            int num = (int) (Math.random()*45+1);
            set.add(num);
        }
        System.out.println(set);
    }
}
