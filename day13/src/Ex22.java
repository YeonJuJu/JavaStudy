//얕은 복사, 깊은 복사

class Point2{
    int x, y;

    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return x + " -- " + y;
    }
}

class Circle implements Cloneable{
    Point2 point;      //원점
    double radius;     //반지름

    public Circle(Point2 point, double radius){
        this.point = point;
        this.radius = radius;
    }

    //얕은 복사
    public Circle shallowCopy(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Circle) obj;
    }

    public String toString(){
        return point + " : " + radius ;
    }

    //깊은 복사
    public Circle deepCopy(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Circle c = (Circle)obj;
        c.point = new Point2(this.point.x, this.point.y);

        return c;
    }
}

public class Ex22 {
    public static void main(String[] args){
        Circle circleOriginal = new Circle(new Point2(10, 10), 4.0);
        Circle circleClone1 = circleOriginal.shallowCopy();
        Circle circleClone2 = circleOriginal.deepCopy();

        System.out.println("original : " + circleOriginal);
        System.out.println("clone1 : " + circleClone1);
        System.out.println("clone2 : " + circleClone2);

        System.out.println("original circle 변경");
        circleOriginal.point.x = 100;
        circleOriginal.point.y = 100;
        circleOriginal.radius = 5.0;

        System.out.println("original : " + circleOriginal);
        System.out.println("clone1 : " + circleClone1);
        System.out.println("clone2 : " + circleClone2);

        /*
        결론 : 얕은 복사는 오리지널 객체의 값을 그대로 복사하기 때문에 내부에
                갖고 있는(멤버 변수로 있는) 객체의 주소를 그대로 복사한다. 따라서 오리지널 내부에
                객체 주소와 클론 내부의 객체 주소는 같다. 따라서 오리지널에서 해당
                객체의 값을 변경하면 같은 객체를 가리키고 있는 클론도 변경된 값을
                가지고 있다.
                하지만 깊은 복사는 내부에 가리키는 객체를 새로 만들어 복사하기 때문에
                오리지널 객체의 값을 변경해도 클론의 객체는 변함이 없다.
                다른 객체를 가리키기 때문이다.
         */

    }
}
