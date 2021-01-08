
public class Ex18 {
	public static void main(String[] args) {
		// Wrapper class
		// primitive type 을 class type 처럼 사용함
		/*
		  boolean  Boolean
		  char     Character
		  byte     Byte
		  short    Short
		  int      Integer
		  long     Long
		  float    Float
		  double   Double
		*/
		Integer i1 = 111;
		System.out.printf("i1 : %d%n", i1);
		
		int n2 = 15;
		Integer i2 = n2; // auto boxing <-> auto unboxing
		System.out.printf("i2 : %d%n", i2);
		
		n2 = new Integer(111);  // auto unboxing
		
		int n3 = 25;
		Integer i3 = new Integer(n3);
		System.out.printf("i3 : %d%n", i3);
		
		int n4 = Integer.parseInt("123");
		System.out.printf("n4 : %d%n", n4);
		
		int n5 = Integer.parseInt("1111", 2); // 2진수 1111이라는 의미
		System.out.printf("n5 : %d%n", n5);
		
		float f1 = Float.parseFloat("123.456F");
		System.out.printf("f1 : %.2f%n", f1);
		
		
		System.out.println("-------------------------------");
		
		
		int number = 15; // 1111
		System.out.printf("Integer.bitCount(%d) : %d%n", 
				            number, Integer.bitCount(number));
		System.out.printf("Integer.toOctalString(%d) : %s%n", 
				            number, Integer.toOctalString(number));
		System.out.printf("Integer.toHexString(%d) : %s%n", 
				            number, Integer.toHexString(number));
		
		
		
		
	}

}


