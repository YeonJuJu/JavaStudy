import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex09 {
    public static void main(String[] args){
        Object[] arrObj = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4", "4"};
        System.out.println("origin array : " + Arrays.toString(arrObj));

        //Set 은 data 의 중복을 허용하지 않는다. 순서도 없다.
        //문자열 1 과 정수 1 은 type 이 다르므로 다른 data 로 처리한다.
        Set set = new HashSet<>();
        for(int i=0;i<arrObj.length;i++){
            set.add(arrObj[i]);
        }

        System.out.println("set : " + set);
    }
}
