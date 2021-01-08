import java.util.Arrays;
import java.util.StringJoiner;

public class Ex13 {
    public static void main(String[] args){
        String animals = "cat,dog,bear";

        //문자열 animals에 저장된 문자들을 ','로 구분하여 문자열 배열 생성
        String[] arrStr = animals.split(",");

        //문자열로 변환하여 출력
        System.out.println(Arrays.toString(arrStr));

        //join을 이용해 합쳐줌
        System.out.println(String.join("-", arrStr));

        StringJoiner sj = new StringJoiner("/", "[", "]");

        sj.add(arrStr[0]);
        sj.add(arrStr[1]);
        sj.add(arrStr[2]);

        System.out.println(sj);

        sj.add("dear");
        System.out.println(sj);

        for(String str : arrStr){
            sj.add(str);
        }
        System.out.println(sj);
    }
}
