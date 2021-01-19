import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args){
        InputStream in = null;
        Scanner scanner = null;

        try {
            in = new FileInputStream("c:\\EclipseIo\\test.txt");
            scanner = new Scanner(in);

            String output = "";
            while((output = scanner.nextLine()) != null){
                System.out.println(output);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }finally{
            try {
                if(in!=null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
