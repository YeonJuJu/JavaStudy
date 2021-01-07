
public class Ex01 {
  public static void main(String[] args) {
  	System.out.println(MathClass.add(222L, 333L));
  	System.out.println(MathClass.subtract(333L,  222L));
  	System.out.println(MathClass.multiply(222L, 3L));
  	System.out.println(MathClass.divide(666L, 333L));
  	System.out.println("========================");
  	
  	MathClass mc = new MathClass();
  	long result = mc.add();
  	System.out.printf("result : %d%n", result);
  	mc.a = 666L;
  	mc.b = 333L;
  	result = mc.add();
  	System.out.printf("result : %d%n", result);
  	
  	System.out.printf("mc.subtract() : %d%n", mc.subtract());
  	System.out.printf("mc.multiply() : %d%n", mc.multiply());
  	System.out.printf("mc.divide()   : %d%n", mc.divide());
  	
  	// The static method add(long, long) from the type MathClass 
  	// should be accessed in a static way (<-- 클래스이름으로 접근)
  	System.out.println(mc.add(123L, 456L));
  	System.out.println(MathClass.add(100L, 200L));
  	
  }
}
// 클래스 정의부 : definition
class MathClass{
	long a, b;
	
	public long add() {
		return a + b;
	}
	public long subtract() {
		return a - b;
	}
	public long multiply() {
		return a * b;
	}
	public long divide() {
		return a / b;
	}
	public static long add(long a, long b) {
		return a + b;
	}
	public static long subtract(long a, long b) {
		return a - b;
	}
	public static long multiply(long a, long b) {
		return a * b;
	}
	public static long divide(long a, long b) {
		return a / b;
	}
	
}






