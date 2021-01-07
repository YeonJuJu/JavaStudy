class A{
	
}
class B{
	
}
class School extends A{
	
}
public class Ex03 {
  public static void main(String[] args) {
  	A a1 = new A();
  	B b1 = new B();
  	
  	School s1 = new School();
  	A a2 = new School();
  	// School s2 = a1; 
  	a1 = a2;
  	s1 = (School)a1;
  	a1 = s1;
  	System.out.println("a1 : " + a1);
  	System.out.println("s1 : " + s1);
  	
  	
  	
  }
}
