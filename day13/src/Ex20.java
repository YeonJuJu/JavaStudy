import java.util.Arrays;

class Point implements Cloneable{
    int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return x + " -- " + y;
    }

    @Override
    protected Object clone(){
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return obj;
    }
}

public class Ex20 {
    public static void main(String[] args){
        Point original = new Point(33, 55);
        Point copy = (Point) original.clone();

        System.out.println(original);
        System.out.println(copy);
        //다음은 false 임
        System.out.println(copy == original);

        System.out.println("=============================");

        int[] arrNum = {1,2,3,4,5};

        //배열 arrNum을 복사하여 같은 내용의 새로운 배열 생성
        int[] arrClone = arrNum.clone();
        System.out.println(Arrays.toString(arrClone));
    }
}
