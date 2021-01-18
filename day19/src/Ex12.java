import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12 {
    public static void main(String[] args){
        // InputStreamReader
        // byte stream 을 character stream 으로 변경하는 역할

        // BufferedReader
        // character stream 으로부터 buffer 를 사용하여 읽어들이는 역할
        // stream 의 성능 향상(?)

        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            // 마치 Scanner 처럼 사용
            System.out.print("Enter a message : ");
            String string = br.readLine();

            System.out.println("message : " + string);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
