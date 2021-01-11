import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

import static java.util.Objects.*;

public class Ex01 extends Object{
    public static void main(String[] args){
        String[][] str2D1 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println("str2d1 = ");
        for(String[] str : str2D1){
            System.out.print(Arrays.toString(str) + "\t");
        }

        System.out.println("\n=========================");

        System.out.println("str2d2 = ");
        for(String[] str : str2D2){
            System.out.print(Arrays.toString(str) + "\t");
        }

        System.out.println("\n=========================");

        //이차원 배열도 문자열로 한번에 출력하게 하는 함수 : Arrays.deepToString
        System.out.println(Arrays.deepToString(str2D1));
        System.out.println(Arrays.deepToString(str2D2));

        System.out.println("\n=========================");

        //다음은 false 가 출력됨
        System.out.println(Objects.equals(str2D1, str2D2));

        //다음은 true 가 출력됨. 배열의 데이터를 비교하기 때문이다.
        System.out.println(Objects.deepEquals(str2D1, str2D2));

        System.out.println("\n=========================");

        //다음은 false 가 출력됨. 해당 배열이 비었으면 true, 아니라면 false
        System.out.println(Objects.isNull(str2D1));

        //다음은 true 가 출력됨. 해당 배열이 비어있지 않으면 true, 아니라면 false
        System.out.println(Objects.nonNull(str2D1));

        //hash 함수는 배열의 주소값을 가지고 계산한다.
        System.out.println("Objects.hashCode(null) : " + Objects.hashCode(null));

        System.out.println("Objects.toString(null) : " + Objects.toString(null));

        //첫번째 값이 null 인 경우 뒤에 문장이 출력
        System.out.println("Objects.toString(null, \"\") : " + Objects.toString(null, ""));

        System.out.println("\n=========================");

        //CASE_INSENSITIVE_ORDER -> 대소문자 무시
        Comparator c = String.CASE_INSENSITIVE_ORDER;

        //첫번째 인자와 두번째 인자를 비교했을 때
        //같으면 0, 첫번째 인자가 더 크면 1, 더 작으면 -1
        System.out.println(compare("aa", "bb", c));
        System.out.println(compare("bb", "aa", c));
        System.out.println(compare("aa", "AA", c));
    }
}
