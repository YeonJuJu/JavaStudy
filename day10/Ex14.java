class Account1{   // Proc : Procedure
	public void interestProc() {
		System.out.println("1% 이자 지급");
	}
}
class Account3 extends Account1{
	@Override
	public void interestProc() {
		System.out.println("3% 이자 지급");
	}
}
class Account5 extends Account1{
	@Override
	public void interestProc() {
		System.out.println("5% 이자 지급");
	}
}
public class Ex14 {
  public static void main(String[] args){
  	/*
  	int[] arrNum = new int[5];
  	arrNum[0] = 11;
  	arrNum[1] = 22;
  	arrNum[2] = 33;
  	arrNum[3] = 44;
  	arrNum[4] = 55;
  	*/
  	
  	Account1[] arrAcc = new Account1[5];
  	arrAcc[0] = new Account3();
  	arrAcc[1] = new Account5();
  	arrAcc[2] = new Account1();
  	arrAcc[3] = new Account5();
  	arrAcc[4] = new Account3();
  	
  	Account1 acc1 = new Account3();
  	Account1 acc2 = new Account5();
  	
  	// 상속 관계에서
  	// 자손클래스의 객체의 주소를 
  	// 부모클래스 타입의 참조변수에 저장할 수 있음
  	/*
  	arrAcc[0].interestProc(); // 3
  	arrAcc[1].interestProc(); // 5
  	arrAcc[2].interestProc(); // 1
  	arrAcc[3].interestProc(); // 5
  	arrAcc[4].interestProc(); // 3
  	*/
  	
  	// 다형성 : polymorphism
  	// 동일한 실행 code의 결과가
  	// runtime시에 실행되는 대상(객체)에 따라
  	// 다르게 나오는 것
  	for(int i = 0; i < arrAcc.length; i++) {
  		arrAcc[i].interestProc();
  	}
  	
  }
}




