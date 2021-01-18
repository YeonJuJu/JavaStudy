import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// 객체 이동
public class Ex18 {
    public static void main(String[] args){
        System.out.println("Program start");

        String dirName = "C:\\EclipseIo";
        String fileName = "data01.dat";

        File dir = new File(dirName);

        if(!dir.exists())
            dir.mkdirs();

        File file = new File(dir, fileName);

        try{
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }




        System.out.println("Program finish");
    }
}
