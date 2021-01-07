class Shape{  // 도형 클래스
	String color = "skyblue";
	public void draw() {
		System.out.println("도형을 그린다");
	}
}
class Point3{
	int x, y;
	public Point3() {
		this(0, 0);
	}
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
class Circle2 extends Shape{
	Point3 center;
	int radius;
	
	public Circle2() {
		// Circle2의 기본생성자로 객체를 생성할 때
		// x, y 좌표는 0, 0 이고, 반지름은 100으로 함
		this(new Point3(0, 0), 100);
	}
	public Circle2(Point3 center, int radius) {
		this.center = center; this.radius = radius;
	}
	@Override
	public String toString() {
		return center + " -- " + radius + " -- " + color;
	}
}
class Triangle extends Shape{
	Point3[] p;
	public Triangle(Point3[] p) {
		this.p = p;
	}
	public Triangle(Point3 p1, Point3 p2, Point3 p3) {
		p = new Point3[] {p1, p2, p3};
	}
	@Override
	public String toString() {
		return p[0] + " -- " + p[1] + " -- " + p[2] + " -- " + color;
	}
}

public class Ex21 {
  public static void main(String[] args) {
  	Circle2 c1 = new Circle2();
  	System.out.println("c1 : " + c1);
  	
  	Circle2 c2 = new Circle2(new Point3(55, 55), 30);
  	System.out.println("c2 : " + c2);
  	
  	Point3[] p = {new Point3(111, 111), 
  			          new Point3(222, 222), 
  			          new Point3(333, 333)};
  	
  	Triangle t1 = new Triangle(p);
  	System.out.println("t1 : " + t1);
  	
  	
  	Triangle t2 = new Triangle( new Point3(123, 234), 
                			          new Point3(345, 456), 
                			          new Point3(567, 678));
  	
  	System.out.println("t2 : " + t2);
  	
  	
  }
}




