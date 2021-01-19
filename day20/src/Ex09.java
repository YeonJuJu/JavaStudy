import java.io.*;

public class Ex09 {
    public static void main(String[] args){
        OutputStream out = null;
        InputStream in = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;

        int numberI = 0;
        double numberD = 0.0;

        try {
            long start = System.currentTimeMillis();

            out = new FileOutputStream("c:\\Eclipse\\DataOutput01.txt");
            dos =  new DataOutputStream(out);

            dos.writeInt(356);
            dos.writeDouble(3.3);

            dos.close();

            in = new FileInputStream("c:\\Eclipse\\DataOutput01.txt");
            dis = new DataInputStream(in);

            numberI = dis.readInt();
            numberD = dis.readDouble();

            System.out.println("numberI : " + numberI + ", numberD : " + numberD);

            long end = System.currentTimeMillis();

            System.out.println("process time : " + (end-start));

            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
