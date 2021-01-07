class Data1{
	int value;
	public Data1(){ }  // 기본 생성자
	public void setValue(int value) {
		this.value = value;
	}
}
class Data2{
	int value;
	// public Data2(){ }
	public Data2(int value){ // 매개변수 있는 생성자
		this.value = value;
	}
}
// 매개변수 있는 생성자를 하나라도 작성하면
// java compiler 가 기본 생성자를 자동으로 만들어주지 않음

public class Ex05 {
  public static void main(String[] args) {
  	Data1 d1 = new Data1();
  	// The constructor Data2() is undefined
  	// Data2 d2 = new Data2();
  	Data2 d2 = new Data2(321);
  }
}




