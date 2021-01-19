import java.io.*;

/*
        Externalizable 직렬화
        ㄴ> 클래스를 직렬화하는 인터페이스이며, 두 개의 추상 메소드를 갖고 있다.

        1) readExternal(ObjectInput in)
        2) writeExternal(ObjectOutput out)

        Externalizable interface 를 implements 하는
        클래스는 반드시
 */

class C implements Externalizable{
    public int n1, n2, n3;

    public C(){}
    public C(int n1, int n2, int n3){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("C.writeExternal");
        out.writeInt(n1 * 2);
        out.writeInt(n2 * 2);
        out.writeInt(n3 * 2);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("C.readExternal");
        n1 = in.readInt() * 11;
        n2 = in.readInt() / 11;
        n3 = in.readInt() % 11;
    }

    @Override
    public String toString(){
        return n1 + " " + n2 + " " + n3;
    }
}

public class Ex05 {
    public static void main(String[] args){
        File dir = new File("C:\\EclipseIo");
        File file = new File(dir, "objectC.dat");

        if(!dir.exists())
            dir.mkdirs();

        C c = new C(11, 22, 33);
        System.out.println("C class : " + c);

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            oos.writeObject(c);
            oos.close();

            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

            C c2 = (C) ois.readObject();
            System.out.println("C2 class : " + c2);


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
