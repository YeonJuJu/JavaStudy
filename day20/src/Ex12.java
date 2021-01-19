import java.io.*;

class Student implements Serializable{
    private String name;
    private int age;
    private String phone;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    @Override
    public String toString(){
        return name + " == " + age + " (" + phone + ") ";
    }
}

public class Ex12 {
    private String filePath;
    private Student student;

    public void init(){
        this.filePath = "c:\\EclipseIo\\student.dat";
        this.student = new Student();
        student.setName("Jungkook");
        student.setAge(25);
        student.setPhone("010-1234-5678");
        System.out.println(student);
    }

    public void serialize(){
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(filePath));

            oos.writeObject(student);
            oos.close();

            ois = new ObjectInputStream(new FileInputStream(filePath));

            student = (Student) ois.readObject();

            System.out.println(student);

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] ags){
        Ex12 ex = new Ex12();
        ex.init();
        ex.serialize();
    }
}
