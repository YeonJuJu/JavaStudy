
/*
  Adapter class 

*/
abstract class Super{
  public abstract void test1();	
  public abstract void test2();	
  public abstract void test3();	
  public abstract void test4();	
  public abstract void test5();	
  public abstract void test6();	
  public abstract void test7();	
  public abstract void test8();	
  public abstract void test9();	
  public abstract void test10();	
}

class AdapterClass extends Super{

	@Override
	public void test1() { }

	@Override
	public void test2() { }

	@Override
	public void test3() { }

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test7() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test8() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test9() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test10() {
		// TODO Auto-generated method stub
		
	}
	
}

class Sub1 extends AdapterClass{

	@Override
	public void test3() {
		System.out.println("test3() in Sub");
	}
	@Override
	public void test5() { 
		System.out.println("test5() in Sub");
	}
}
class Sub2 extends AdapterClass{

	@Override
	public void test2() {
		System.out.println("test2() in Sub");
	}
	@Override
	public void test4() { 
		System.out.println("test4() in Sub");
	}
}
class Sub3 extends AdapterClass{

	@Override
	public void test8() {
		System.out.println("test8() in Sub");
	}
	@Override
	
	public void test9() { 
		System.out.println("test9() in Sub");
	}
}
public class Ex04 {
  public static void main(String[] args) {
  	Super s = new Sub1();
  	      s = new Sub2();
  	      s = new Sub3();
  	
  	s.test1();
  	s.test2();
  	s.test3();
  	s.test4();
  	s.test5();
  	s.test6();
  	s.test7();
  	s.test8();
  	s.test9();
  	s.test10();
  	
  }
}








