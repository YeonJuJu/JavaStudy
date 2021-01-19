import java.io.*;

public class Ex10 {
    public static void main(String[] args){
        OutputStream out = null;
        InputStream in = null;

        DataOutputStream dos = null;
        DataInputStream dis = null;

        try{
            out = new FileOutputStream("C:\\EclipseIo\\DataText.txt");
            dos = new DataOutputStream(out);

            int valueOut = 333;

            dos.writeInt(valueOut);

            /*
                writeInt() : 한 번에 4bytes 씩 읽어서 int type 으로 write 함
                             메모장에서는 한 번에 1, 2, 3 bytes 씩 저장할 수 있으므로
                             4bytes data 가 들어오면 한 번에 읽을 수 없어서
                             문자가 깨진다.

             */


            dos.close();

            in = new FileInputStream("C:\\EclipseIo\\DataText.txt");
            dis = new DataInputStream(in);

            int valueIn = dis.readInt();

            System.out.println("valueIn : " + valueIn);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{

        }
    }
}
