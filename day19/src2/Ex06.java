import java.io.*;

public class Ex06 {
    public static void main(String[] args){
        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream("C:\\Users\\uplay\\OneDrive\\Documents\\카카오톡 받은 파일\\donghoon.mp4");
            out = new FileOutputStream("donghoon.mp4");

            byte[] buf = new byte[500];

            long start = System.currentTimeMillis();
            while(true){
                // byte 배열을 넣게 되면 받은 byte 크기를 return
                int count = in.read(buf);
                out.write(buf, 0, count);
                if(count != buf.length)
                    break;
            }
            long end = System.currentTimeMillis();

            System.out.println("time : " + (end-start));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(out != null)
                    out.close();
                if(in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
