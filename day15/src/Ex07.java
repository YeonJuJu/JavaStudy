import java.util.Arrays;
import java.util.Comparator;

public class Ex07 {
    public static void main(String[] args){
        Integer[] arrNum = new Integer[]{3,5,1,4,2};
        System.out.println(Arrays.deepToString(arrNum));
        System.out.println("=========================");

        //오름차순 정렬
        Arrays.sort(arrNum);
        System.out.println(Arrays.deepToString(arrNum));
        System.out.println("=========================");

        //내림차순 정렬
        Arrays.sort(arrNum, new DescendingComp());
        System.out.println(Arrays.deepToString(arrNum));
        System.out.println("=========================");

    }
}
class DescendingComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Integer && o2 instanceof Integer){
            Integer num1 = (Integer)o1;
            Integer num2 = (Integer)o2;

            return -(num1.compareTo(num2));
        }

        return -1;
    }
}
