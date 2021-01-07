
public class Ex02 {
  public static void main(String[] args) {
  	String[] arrStr = new String[] {"100", "200", "300"};
  	
  	System.out.println(concatenate("", "100", "200", "300"));
  	System.out.println(concatenate("-", arrStr));
  	System.out.println(concatenate(",", new String[] {"1","2","3"}));
  	
  	System.out.println("[" + concatenate("-", new String[0]) + "]");
  	System.out.println("[" + concatenate("-") + "]");
  }
  
  //  가변인자 (varargs)
  public static String concatenate(String delim, String...args) {
  	String result = "";
  	for(String str : args) {
  		result += str + delim;
  	}
  	return result;
  }
  
}
