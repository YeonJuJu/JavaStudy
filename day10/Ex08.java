
public class Ex08 {
  public static void main(String[] args) {
  	Point3D2 p3d = new Point3D2();
  	
  	System.out.println("p3d : " + p3d);
  	
  }
}
class Point2{
	int x = 10, y = 20;
	// public Point2() {}
	public Point2(int x, int y) {
		this.x = x; this.y = y;
	}
}
class Point3D2 extends Point2{
	int z;
	public Point3D2() {
		this(111, 222, 333);
	}
	public Point3D2(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	@Override
	public String toString() {
		return "x -- " + x + ", y -- " + y + ", z -- " + z;
	}
}
