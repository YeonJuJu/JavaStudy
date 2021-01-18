import java.io.*;
import java.util.Arrays;

// 폴더 복사
public class Ex17 {
    public static void main(String[] args){
        String source = "C:\\Users\\uplay\\Github\\day19\\src";
        String destination = "C:\\Users\\uplay\\Github\\day19\\src2";

        File dirSource = new File(source);
        File dirDestination = new File(destination);

        if(!dirDestination.exists())
            dirDestination.mkdirs();

        String[] list = dirSource.list();

        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;

        try{
            for(String name : list){
                File sourceFile = new File(dirSource, name);
                bis = new BufferedInputStream(new FileInputStream(sourceFile));

                File desFile = new File(dirDestination, name);
                bos = new BufferedOutputStream(new FileOutputStream(desFile));

                // 파일 복사
                byte[] data = new byte[(int)sourceFile.length()];

                bis.read(data);
                bos.write(data);
                bos.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(bis != null)
                    bis.close();
                if(bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
