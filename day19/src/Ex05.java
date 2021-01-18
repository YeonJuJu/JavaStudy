import java.io.*;

public class Ex05 {
    public static void main(String[] args){
        InputStream in = null;
        OutputStream out = null;

        try {
            in = new FileInputStream("C:\\EclipseIo\\blue_ppu.png");
            out = new FileOutputStream("blu_ppu.png");

            long start = System.currentTimeMillis();
            while(true){
                int data = in.read();
                if(data == -1)
                    break;
                out.write(data);
            }
            long end = System.currentTimeMillis();

            System.out.println("time : " + (end-start));

            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
