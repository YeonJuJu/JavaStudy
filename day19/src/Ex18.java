import java.io.*;

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

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try{
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            oos.writeObject(new Integer(11));
            oos.writeObject(new Float(11.43f));
            oos.writeObject(new Double(11.236));
            oos.writeObject(new String("언제끝나"));
            oos.writeObject(new Byte((byte)7));

            oos.close();

            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));


            // object 이기 때문에 입력한 순서와 꺼내는 순서가 동일해야 한다.
            int numI = (int) ois.readObject();
            float numF = (float) ois.readObject();
            double numD = (double) ois.readObject();
            String str = (String) ois.readObject();
            byte numB = (byte) ois.readObject();

            System.out.println(numI + " " + numF + " " + numD + " " + str + " " + numB + " ");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        System.out.println("Program finish");
    }
}
