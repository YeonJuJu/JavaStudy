import java.io.*;

public class Ex08 {
    public static void main(String[] args){
        System.out.println("Program Started");

        OutputStream out = null;
        DataOutputStream dos = null;

        String str = "Hello Java Programming";

        try{
            out = new FileOutputStream("c:\\EclipseIo\\write01.txt");
            dos = new DataOutputStream(out);
            dos.writeUTF(str);

            dos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Program Finished");
    }
}
