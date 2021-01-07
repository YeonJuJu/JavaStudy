class ParentA{ }
class ChildA1 extends ParentA { }
class ChildA2 extends ParentA { }
class ChildA3 extends ParentA { }
class ChildA4 extends ParentA { }
class ChildA5 extends ParentA { }
public class Ex06 {
	public static void instanceofTest(ParentA p) {
		if(p instanceof ChildA1) {
			System.out.println("ChildA1"); // 1
		}else if(p instanceof ChildA2) {
			System.out.println("ChildA2"); // 2
		}else if(p instanceof ChildA3) {
			System.out.println("ChildA3"); // 3
		}else if(p instanceof ChildA4) {
			System.out.println("ChildA4"); // 4
		}else if(p instanceof ChildA5) {
			System.out.println("ChildA5"); // 5
		}else if(p instanceof ParentA) {
			System.out.println("ParentA"); // 6
		}
	}
  public static void main(String[] args) {
  	ParentA p  = new ParentA();
  	ChildA1 a1 = new ChildA1();
  	ChildA2 a2 = new ChildA2();
  	ChildA3 a3 = new ChildA3();
  	ChildA4 a4 = new ChildA4();
  	ChildA5 a5 = new ChildA5();
  	
  	instanceofTest(p);
  	instanceofTest(a1);
  	instanceofTest(a2);
  	instanceofTest(a3);
  	instanceofTest(a4);
  	instanceofTest(a5);
  	
  }
}




