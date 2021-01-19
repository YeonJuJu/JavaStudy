
/*
        Collection class 는 직렬화를 지원함
        Collection 내부에 저장되는 class 가 직렬화가 되는 class 이면
        Collection 객체를 저장하고 읽어올 수 있음
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

class Point implements Serializable{
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    @Override
    public String toString(){
        return String.format("%d -- %d\n", this.x, this.y);
    }
}

public class Ex06 {
    public static void main(String[] args){
        System.out.println("Program Started");

        ArrayList<Point> list = new ArrayList<>();

        Random random = new Random();

        // random.nextInt(i) : 0 ~ i-1 인 임의의 수
        for(int i=500;i<10000;i++){
            list.add(new Point(random.nextInt(i), random.nextInt(i)));
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("====================================");

        File dir = new File("c:\\EclipseIo");
        File file = new File(dir, "point.dat");

        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            oos.writeObject(list);
            oos.close();

            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));

            ArrayList<Point> list2 = (ArrayList<Point>) ois.readObject();

            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(ois != null)
                    ois.close();
                if(oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Program Finished");
    }
}
