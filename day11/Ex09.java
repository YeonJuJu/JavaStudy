interface Inter03{
	public abstract void Inter03Display();
}
interface Inter04{
	public abstract void Inter04Display();
}
interface Inter05{
	public abstract void Inter05Display();
}

// interface를 다중상속 받는 interface
interface InterSub01 extends Inter03, Inter04, Inter05{ }

// interface를 다중상속 받는 class
class InterSub02 implements Inter03, Inter04, Inter05{

	@Override
	public void Inter05Display() { 
		System.out.println("Inter05Display() 오버라이딩");
	}

	@Override
	public void Inter04Display() { 
		System.out.println("Inter04Display() 오버라이딩");
	}

	@Override
	public void Inter03Display() { 
		System.out.println("Inter03Display() 오버라이딩");
	} 
	
}

public class Ex09 {
  public static void main(String[] args) {
  	Inter03 i3 = new InterSub02();
  	Inter04 i4 = new InterSub02();
  	Inter05 i5 = new InterSub02();
  	InterSub02 is2 = new InterSub02();
  	
  	i3.Inter03Display();
  	// i3.Inter04Display();
  	// i3.Inter05Display();
  	
  	// i4.Inter03Display();
  	i4.Inter04Display();
  	// i4.Inter05Display();
  	
  	// i5.Inter03Display();
  	// i5.Inter04Display();
  	i5.Inter05Display();
  	
  	is2.Inter03Display();
  	is2.Inter04Display();
  	is2.Inter05Display();
  	
  }
}





