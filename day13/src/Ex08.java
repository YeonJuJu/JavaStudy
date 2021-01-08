import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
    public static void main(String[] args){
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try {
            fis = new FileInputStream("JavaStudy.txt");
            bis = new BufferedInputStream(fis);
            int data = -1;
            while((data = bis.read()) != -1)
                System.out.print((char)data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bis != null)
                    bis.close();
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
