import java.util.ArrayList;

public class Ex04 {
  public static void main(String[] args) {
  	
  	// String type 의  data만 저장하는  <-- Generic 
  	// ArrayList 객체 생성하기
  	
  	       // Generic <-- type parameter
  	ArrayList<String> list1 =new ArrayList<String>();
  	// 기본적으로 data 10 개를 보관할 수 있는 ArrayList 객체가 생성됨
  	//             ㄴ 객체의 주솟값
  	list1.add("포도");  // 0
  	list1.add("딸기");  // 1
  	list1.add(new String("복숭아"));  // 2
  	list1.add(new String("망고"));  // 3
  	
  	list1.get(1);  // "딸기"
  	System.out.println("list1.get(1) : " + list1.get(1));
  	System.out.println("list1.size() : " + list1.size());
  	System.out.println("-----------------------------------");
  	
  	
  	for(int i = 0; i < list1.size(); i++) {
  		System.out.printf("%s ", list1.get(i));
  	}
  	System.out.println("\n---------------------------------");
  	
  	// Advanced for loop : 향상된 for문
  	for(String fruit : list1) {
  		System.out.printf("%s ", fruit);
  	}
  	System.out.println("\n---------------------------------");
  	
  	
  	
  }
}
