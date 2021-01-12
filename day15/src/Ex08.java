import java.util.Arrays;
import java.util.Comparator;

public class Ex08 {
    public static void main(String[] args){
        String[] animals = {"cat", "dog", "lion", "tiger", "Rabbit"};
        System.out.println("animals : " + Arrays.toString(animals));

        Arrays.sort(animals);
        System.out.println("animals : " + Arrays.toString(animals));

        Arrays.sort(animals, String.CASE_INSENSITIVE_ORDER);
        System.out.println("animals : " + Arrays.toString(animals));

        Arrays.sort(animals, new DescendingCom2());
        System.out.println("animals : " + Arrays.toString(animals));
    }
}

class DescendingCom2 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;

            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}