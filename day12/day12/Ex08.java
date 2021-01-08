
public class Ex08 {
  private int outerIv = 0;
  static int outerCv = 11;  
  
  class InstacenInner{
  	//  내부클래스에서는
  	//  외부클래스의  private 멤버에도 접근이 가능함
  	int iiv = outerIv;
  	int iiv2 = outerCv;
  }
  static class StaticInner{
  	// static inner class 에서는 
  	// 외부 클래스의 instance 멤버변수에 접근할 수 없음
  	// int iiv = outerIv;
  	static int isc = outerCv;  // 0
  	static final int iscFinale = 22;  	
  }
  
  public void myMethod() {
  	int lv = 0;
  	// 메소드 내부에서 상수를 선언+초기화할 수 있음
  	// JDK 1.8 부터 final 을 생략할 수 있음 
  	final int LV = 0; 
  	
  	class LocalInner{
  		int liv = outerIv;
  		int liv2 = outerCv;
  		final int liv3 = lv;
  		int liv4 = LV;
  	}
  	
  }
  public static void main(String[] args) {
  	System.out.println("Ex08.StaticInner.isc : " + Ex08.StaticInner.isc);
  	System.out.println("Ex08.StaticInner.iscFinale : " + Ex08.StaticInner.iscFinale);
  }
  
  
  
}
