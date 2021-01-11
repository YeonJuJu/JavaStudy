import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex03 {
    public static void main(String[] args){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("data2.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 1. 각 라인 별 합계 구하기
        // 2. 모든 라인의 합계 구하기

        StringTokenizer st;

        //라인별 합계
        int sum = 0;
        //전체 합계
        int total = 0;

        int count = 0;
        int num = 0;

        while(scanner.hasNextLine()){
            count++;
            st = new StringTokenizer(scanner.nextLine(), ",");
            while(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
                total += num;
                sum += num;
            }
            System.out.println(count + " line sum = " + sum);
            sum = 0;
        }
        System.out.println("line total sum = " + total);

    }
}
