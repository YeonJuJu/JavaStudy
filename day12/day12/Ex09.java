
class Outer{
	int value = 10;
	
	class Inner{
		int value = 22;
		
		public void method1() {
			int value = 33;
			System.out.println("           value : " + value);
			System.out.println("      this.value : " + this.value);
			System.out.println("Outer.this.value : " + Outer.this.value);
		}
	}  // Inner
} // outer

public class Ex09 {
  public static void main(String[] args) {
  	Outer outer = new Outer();
  	Outer.Inner inner = outer.new Inner();
  	inner.method1();
  	
  }
}
