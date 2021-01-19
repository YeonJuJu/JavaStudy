import java.io.*;

public class Ex03 {
    public static void main(String[] args){
        System.out.println("Program Started");

        File dir = new File("c:\\EclipseIo");
        File file = new File(dir, "object02.dat");

        if(!dir.exists())
            dir.mkdirs();

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

           A2 a2 = (A2)ois.readObject();
           System.out.println("a2.num1 : " + a2.num1);
           System.out.println("a2.num2 : " + a2.num2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Program Finished");
    }
}
