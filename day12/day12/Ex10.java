
public class Ex10 {
	
	// 이름없는 클래스(Anonymous class)는
	// 클래스 정의부가 객체를 생성하는 code 가 됨
  
	Object iv = new Object() {
                int number1 = 11;
                int number2 = 22;
                public void method() {
                	System.out.println("이름없는 클래스의 method()");
                }
            	};
	
	static Object cv = new Object() {
                      int number1 = 11;
                      float number2 = (float)22.22;
                      public void method() {
                      	System.out.println("이름없는 클래스의 method()");
                      }
                  	};
                  	
	public void method() {
		 Object lv = new Object() {
                     int number1 = 11;
                     float number2 = (float)22.22;
                     public void method() {
                     	System.out.println("이름없는 클래스의 method()");
                     }
                 	};
	}
	
}
