class Point{
	int x, y;
	public Point() { }
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	public String getLocation() {
		return "x -- " + this.x + ", y -- " + this.y;
	}
}
class Point3D extends Point{
	int z;
	public Point3D() {
		super(); // 부모클래스의 기본생성자 (생략가능)
	}
	// 자손 클래스의 매개변수 있는 생성자 - 1
	public Point3D(int z) {
		super(); // 부모클래스의 기본생성자 (생략가능)
		this.z = z;
	}
	// 자손 클래스의 매개변수 있는 생성자 - 2
	public Point3D(int x, int y, int z) {
		super(x, y); // 부모클래스의  매개변수 있는 생성자 (생략불가능)
		this.z = z;
	}
	@Override
	public String getLocation() {
		return super.getLocation() + ", z -- " + this.z;
	}
}
public class Ex07 {
  public static void main(String[] args) {
  	Point p1 = new Point();
  	String result1 = p1.getLocation();
  	System.out.println("result1 [" + result1 + "]");
  	
  	Point3D p3d1 = new Point3D();
  	String result2 = p3d1.getLocation();
  	System.out.println("result2 [" + result2 + "]");
  	
  	// 자손클래스의 매개변수 있는 생성자로 
  	// 객체 생성하기
  	Point3D p3d2 = new Point3D(11);
  	result2 = p3d2.getLocation();
  	System.out.println("result2 [" + result2 + "]");
  	
  	Point3D p3d3 = new Point3D(22, 55, 77);
  	result2 = p3d3.getLocation();
  	System.out.println("result2 [" + result2 + "]");
  }
}





