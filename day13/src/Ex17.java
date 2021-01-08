import java.util.StringTokenizer;

public class Ex17 {
	public static void main(String[] args) {
		String data = "100,,,222,333";
		String[] result = data.split(",");
		
		// System.out.println(Arrays.deepToString(result));
		StringTokenizer st = new StringTokenizer(data, ",");
				
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "|");
		}
		System.out.println("\n------------------------");
		System.out.println("배열요소의 개수  : " + result.length);
		
		int i = 0;
		for(;st.hasMoreTokens();i++) {
			System.out.print(st.nextToken() + "|");
		}
		System.out.println("\n------------------------");
		System.out.println("배열요소의 개수  : " + i);
		
		
	}
}
