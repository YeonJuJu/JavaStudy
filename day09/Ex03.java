
/*
   변수(공간에 할당된 값을)를 사용하기 전에
   반드시 변수(공간)이 초기화되어있어야 함
   초기화 : 변수공간에 처음으로 값을 할당하는 것
   멤버변수(자동 초기화 지원 (O)) <-- 생성자가 동작함
   지역변수(자동 초기화 지원 (X) : 명시적 초기화를 해 주어야 함)
   
   클래스 작성 : 클래스 내부에 정의한 변수와 메소드를 사용하려고 함
         (정의)  ㄴ 사용하려면 메모리 상에서 사용 가능한 형태로 있어야 함
                                             instance -->  ㄴ 객체(Object)
                                             
   클래스를 사용하기 전에, 클래스의 멤버변수를 초기화해야 함
   이 역할을 하는 것을 생성자(constructor)라고 함
                        ㄴ 멤버변수를 초기화함
   
   생성자 : 1) 클래스이름과 같은 이름의 메소드
            2) 클래스 내부에 생성자를 하나도 작성하지 않으면
               기본생성자(매개변수 없는 생성자)가 자동으로 추가됨
                                                    javac.exe
            3) return 값이 없음 : return type 없음
               void 키워드를 사용하지 않음
            4) instance 생성할 때 호출됨   
            5) instance 생성 후에 참조변수로 호출할 수 없음
            6) 생성자 안에서 this() 형식으로 
               같은 클래스 안에서 다른 생성자를 호출할 수 있음
            7) 일반 메소드에서는 6)과 같이 다른 생성자를 
               호출할 수 없음
            8) 생성자 내부에서 다른 생성자를 호출하는 code(this()) 는
               생성자의 첫 째줄에서 작성해야 함    
            8) 생성자도 메소드의 일종이므로 overloading 이 됨   
*/


public class Ex03 {
  public static void main(String[] args) {
  	Student std = new Student();
  	std.studentNumber = 1;
  	std.age = 21;
  	System.out.println(std);
  }
}

class Student{
	int studentNumber;
	int age;
	
	@Override
	public String toString() {
		return studentNumber + " : " + age;
	}
}








