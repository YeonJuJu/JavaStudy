
interface Inter06{
	public abstract void Inter06Method();
}
abstract class Super06{
	public abstract void Super06Method();
}
// 클래스와 인터페이스를 동시에 다중 상속 받을 수 있음
class Sub06 extends Super06 implements Inter06{

	@Override
	public void Inter06Method() { 
		System.out.println("Inter06Method() in Sub06");
	}

	@Override
	public void Super06Method() { 
	  System.out.println("Super06Method() in Sub06");
	}
}
public class Ex10 {
  public static void main(String[] args) {
  	Sub06 s6 = new Sub06();
  	Inter06 i6 = new Sub06();
  	Super06 sp6 = new Sub06();
  	
  	s6.Inter06Method();
  	s6.Super06Method();

  	i6.Inter06Method();
  	//i6.Super06Method();

  	//sp6.Inter06Method();
  	sp6.Super06Method();
  	
  	
  }
}





