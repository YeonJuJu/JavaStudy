import java.util.StringTokenizer;

public class Ex16 {
  public static void main(String[] args) {
  	String input = "오십이만칠천백십삼";
  	
  	System.out.println(input);
  	System.out.println("------------------------");
  	
  	System.out.println(korean2Num(input));
  	
  }
  // 한글을 숫자로 바꾸기
  public static long korean2Num(String input) {
  	long result = 0;     // result : 최종결과를 저장함
  	long tmpResult = 0;  // tmpResult : 십,백,천 단위의 값을 저장하는 임시변수
  	long num = 0;
  	
  	final String NUMBER = "영일이삼사오육칠팔구";
  	final String UNIT   = "십백천만억조";
  	final long[] UNIT_NUM = {10,100,1000,10000,(long)1e8, (long)1e12};
  	//                       십 백   천    만        억          조
  	
  	//                            input <-- "오십이만칠천백십삼"
  	//                             UNIT <-- "십백천만억조"
  	StringTokenizer st = new StringTokenizer(input, UNIT, true);
  	
  	while(st.hasMoreTokens()) {
  		String token = st.nextToken();
  		
  		// NUMBER <-- "영일이삼사오육칠팔구";
  		// check 가 -1 인 경우 : 
  		// token 에 저장된 문자열이 NUMBER에 없는 경우
  		// <-- 숫자가 아니고 단위(UNIT)인 경우임
  		int check = NUMBER.indexOf(token);
  		
  		if(check == -1) {  // 단위인 경우
  			if("만억조".indexOf(token) == -1) { // 만억조 단위가 아닌 경우
  				tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
  			}else {  // 만억조 단위인 경우
  				tmpResult += num;
  				result += 
  						(tmpResult != 0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
  				tmpResult = 0; 				
  			}
  			num  = 0;  // num을 다시 0으로 초기화함
  		} else {  // 숫자인 경우
  			num = check;
  		} // if-else
  		
  		System.out.println(result + tmpResult + num);
  		
  	}  // while
  	System.out.println("\n------------------------");
  	return result + tmpResult + num;
  }
  
}











