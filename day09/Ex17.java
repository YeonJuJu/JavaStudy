/*
  상속(Inheritance) <-- Extension(확장) : extends
  
  default + extension
     |         |
   부모       자식
  (클래스)   (클래스)
  
  수직 관계 (부모 자식 관계)
  수평 관계 (X) 형제 관계 (X)
  
  

*/
public class Ex17 {
  public static void main(String[] args) {
  	Point p1 = new Point();   // x, y
  	// System.out.println(new Point());
  	p1.x = 10;
  	p1.y = 10;
  	// p1.z = 10;
  	
  	Point3D p3d1 = new Point3D(); // x, y, z
  	// x cannot be resolved or is not a field
  	p3d1.x = 100;
  	p3d1.y = 100;
  	p3d1.z = 100; 
  	
  	// Point p2 = new Point3D();
  	Point3D p3d2 = new Point3D();
  	p3d2.x = 22;
  	p3d2.y = 22;
  	p3d2.z = 22;
  	  	
  	Point p3 = p3d2;
  	p3.x = 33;
  	p3.y = 33;
  	// p3.z = 33;
  	
  	System.out.println("p3d2 : " + p3d2);
  	System.out.println("p3   : " + p3);
  	
  	
  	Point p4 = new Point3D();
  	// Type mismatch: cannot convert from Point to Point3D
  	Point3D p3d3 = (Point3D)p4;
  	
  	// compile 오류 (X)
  	// runtime 오류 (O)
  	Point p5 = new Point();
  	// Point cannot be cast to Point3D
  	// Point3D p3d4 = (Point3D)p5;
  	if(p5 instanceof Point3D) {
  		System.out.println("p5 instanceof Point3D 가 참인 경우");
  		Point3D p3d4 = (Point3D)p5;
  	}
  	
  	// instanceof 연산자
  	// 참조변수 instanceof ClassType
  	/*
    	Point p4 = new Point3D();
    	Point3D p3d3 = (Point3D)p4;
  	*/
  	 System.out.println("p3d3 instanceof Point3D : " + (p3d3 instanceof Point3D));
  	// p3d3 에 저장된 주소지에 가면 Point3D 의 객체가 있는가?
  	 System.out.println("p4 instanceof Point3D : " + (p4 instanceof Point3D));
   	
  	 Point p6 = new Point();
  	 System.out.println("p6 instanceof Point3D : " + (p6 instanceof Point3D));
  	 System.out.println("p6 instanceof Point : " + (p6 instanceof Point));
  }
}
class Point{
	int x, y;
}
class Point3D extends Point{
	int z;
}
/*
class Point4D extends Point3D{
	int w;
}
*/


