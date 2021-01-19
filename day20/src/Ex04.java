import java.io.*;

// transient variable -> 전송을 하고 싶지 않은 변수 0으로 나온다
// 직렬화 대상에서 제외시키고자 하는 멤버 변수에는 transient 키워드를 사용한다.

class B implements Serializable{
    public int num1;
    private int num2;
    protected int num3;
    int num4;
    public final int num5;
    public static int num6;

    public transient int num7;

    public B(int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
        this.num7 = num7;
    }

    @Override
    public String toString(){
        return num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7;
    }
}

public class Ex04 {
    public static void main(String[] args){
        String dirName = "c:\\EclipseIo";
        String fileName = "objectB.dat";

        File dir = new File(dirName);
        File file = new File(dir ,fileName);

        B b = new B(11, 22, 33, 44, 55, 66, 77);
        System.out.println("B class : " + b);

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oos.writeObject(b);

            if(oos != null)
                oos.close();

            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            B b2 = (B) ois.readObject();

            System.out.println("B class : " + b2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
