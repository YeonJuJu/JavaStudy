
// final 키워드

/* 
  1) 클래스에 사용하는 경우
     상속을 금지함
     final 로 설정된 클래스는
     다른 클래스의 자손 클래스는 될 수 있으나
                   조상 클래스는 될 수 없음
*/
final class FinalA{ }
// The type ChildA cannot subclass the final class FinalA
// class ChildA extends FinalA{ }

// 2) 메소드에 사용하는 경우
//    final로 설정된 메소드는 
//    자손클래스에서 overriding 할 수 없음

class FinalC{
	public final void display() {
		System.out.println("final void display() in FinalB");
	}
}
class ChildC extends FinalC{
	// Cannot override the final method from FinalC
	/*
	@Override
	public final void display() {
		System.out.println("final void display() in FinalB");
	}
	*/
}

/* 
   3) 변수에 사용하는 경우 :  상수가 됨
       ㄴ 값을 계속 할당할 수 있음                       
   
     상수 : 처음 값을 저장하면
            프로그램 실행 중에 값을 다시 할당할 수 없음
             ㄴ 프로그램 실행 중에 변하면 안 되는 값을 상수로 함
*/ 

class FinalD{
	public int num1;
	public int num2 = 22;
	
	//                    constant (literal data : 11, 5698, 'A')   
	// final로 설정된 변수는 상수의 속성(처음 한 번만 할당됨)을
	// 가지고 있어서 선언할 때 반드시 초기화해 주어야 함
	
	public final int num3 = 33;
	
	// The blank final field num4 may not have been initialized
	public final int num4;
	
	// num4 는 생성자에서 초기화 해 줌
	public FinalD(int num4) {
		this.num4 = num4;
	}
	
	@Override
	public String toString() {
		return num1 + " -- " + num2 + " -- " + num3 + " -- " + num4;
	}
}
public class Ex10 {
  public static void main(String[] args) {
  	FinalD f1 = new FinalD(35);
  	FinalD f2 = new FinalD(3425);
  	FinalD f3 = new FinalD(845);
  	
  	System.out.println(f1);
  	System.out.println(f2);
  	System.out.println(f3);
  }
}








