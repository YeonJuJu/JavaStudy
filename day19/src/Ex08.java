import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args){
        // System.in <-- 표준 입력 스트림 ㅣ data 읽을 준비
        Scanner scanner = new Scanner(System.in);

        // System.out <-- 표준 출력 스트림 ㅣ data 쓸 준비
        OutputStream out = null;

        try {
            out = new FileOutputStream("string.txt");

            while(true){
                System.out.print("문자열을 입력하세요(종료 : exit) : ");
                String str = scanner.nextLine();

                if(str.equalsIgnoreCase("exit")){
                    break;
                }

                byte[] data = str.getBytes();

                out.write(data);

                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(out != null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
