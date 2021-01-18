import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13 {
    public static void main(String[] args){
        //InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a integer : ");
            String message = br.readLine();

            int number = Integer.parseInt(message);
            System.out.println("number : " + number);

            System.out.print("Enter a real number : ");
            message = br.readLine();

            float f = Float.parseFloat(message);
            System.out.println("number : " + f);

            System.out.print("Enter a character : ");
            char ch = (char)br.read();
            System.out.println("character : " + ch);

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
