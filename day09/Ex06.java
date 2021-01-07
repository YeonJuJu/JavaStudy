
public class Ex06 {
  public static void main(String[] args) {
  	new MultiplicationTable();  // 구구단 전체 출력하기
  	new MultiplicationTable(5);  // 지정하는 단만 출력하기
  }
}
class MultiplicationTable{
	public MultiplicationTable() {
		display();
		System.out.println("-----------------------------");
	}
  public MultiplicationTable(int dan) {
  	display(dan);
  	System.out.println("-----------------------------");
	}
  // 구구단 전체 출력하기
  public void display() {
  	for(int i = 2; i <= 9; i++) {
  		System.out.printf("-- %d단 --%n", i);
  		for(int j = 1; j <= 9; j++) {
  			System.out.printf("%d X %d = %d%n", i, j, i*j);
  		}
  		System.out.println();
  	}
  }
  // 지정하는 단만 출력하기
  public void display(int dan) {
  	System.out.printf("-- %d단 --%n", dan);
  	for(int j = 1; j <= 9; j++) {
  		System.out.printf("%d X %d = %d%n", dan, j, dan*j);
  	}
  }
  
	
}
