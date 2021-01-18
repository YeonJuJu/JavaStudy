import java.io.*;

public class Ex03 {
    public static void main(String[] args){
        OutputStream out = null;

        try {
            out = new FileOutputStream("C:\\EclipseIo\\javaProgramming.txt");

            String str = "hello_java";
            byte[] arrByte = str.getBytes();
            out.write(arrByte);

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
