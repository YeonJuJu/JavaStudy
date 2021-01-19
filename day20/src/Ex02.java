import java.io.*;

/*
    user defined type (class) 를 stream 에 연결해 입출력하는 경우,
    (ㄴ> ObjectOutputStream, ObjectInputStream 사용)
    Serializable interface 를 implements 한 객채만 stream 에 연결 가능
 */

class A2 implements Serializable{
    public int num1;
    public int num2;

    public A2(){

    }
}
public class Ex02 {
    public static void main(String[] args){
        System.out.println("Program Started");

        String dirName = "c:\\EclipseIo";
        String fileName = "object02.dat";

        File dir = new File(dirName);
        File file = new File(dir, fileName);

        if(!dir.exists())
            dir.mkdirs();

        A2 a2 = new A2();
        a2.num1 = 11;
        a2.num2 = 22;

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            oos.writeObject(a2);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Program Finished");
    }
}
