import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        //System.in : 표준 입력 스트림
        Scanner scanner = new Scanner(System.in);

        //System.out : 표준 출력 스트림
        System.out.println();

        File file = new File("data1.txt");
        try {
            //다음과 같이 하면 파일에 있는 내용을 입력받는 것
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int sum = 0;
        int count = 0;
        while(scanner.hasNext()){
            sum += scanner.nextInt();
            count++;
        }

        System.out.println("sum = " + sum + ", average = " + sum/count);

        System.out.println("프로그램 종료");
    }
}
