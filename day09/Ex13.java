class InitBlock{
	// static 멤버변수
	static int cv = 1; // 1) cv-0 2) cv-1
	
	// instance 멤버변수
	int iv = 1;  // 4) iv-0, iv-1
	
	// static 초기화 블럭
	static {  cv = 2;  }  // 3) cv-2

	// instance 초기화 블럭  
	// 객체가 생성될 때 동작함
	// 생성자 보다 먼저 동작함
	{ iv = 2;  cv = 3; }  // 5) iv-2, cv-3
	
	// 생성자
	public InitBlock() { iv = 3; cv = 4; }  // 6) iv-3, cv-4
	
}

public class Ex13 {
  public static void main(String[] args) {
  	
  	// 초기화 블럭 :  Initialization Block
  	// 생성자가 실행되기 전에 실행되는 code block
  	// static 초기화 블럭, instance 초기화 블럭

     //  가장 먼저 static 변수가 기본값으로 초기화되고
     //  초기화하는 값으로 할당됨 
     System.out.println("InitBlock.cv : " + InitBlock.cv);

     // static  초기화 블럭이 실행됨
     System.out.println("InitBlock.cv : " + InitBlock.cv);

     InitBlock ib = new InitBlock();
     System.out.println("ib.iv : " + ib.iv);
     System.out.println("InitBlock.cv : " + InitBlock.cv);  
  	
  }
}

