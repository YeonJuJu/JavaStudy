class Point2{
	int x, y;
	public Point2() {
		this(50, 50);
	}
	public Point2(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	@Override
	public String toString() {
		return x + " -- " + y;
	}
}
class Point3D2{
	int z;
	@Override
	public String toString() {
		return super.toString() + " -- " + z;
	}
}
class Circle{
	Point2 p;
	int radius;
	public Circle() {
		p = new Point2(); // <== x:50 , y :50 
		radius = 20;
	}
	@Override
	public String toString() {
		return p + " -- " + radius;
	}	
}
public class Ex20 {
  public static void main(String[] args) {
  	Circle c = new Circle();
  	System.out.println("c : " + c);
  	
  	c.p.x = 30;
  	c.p.y = 30;
  	c.radius = 40;
  	System.out.println("c : " + c);
  	
  }
}





