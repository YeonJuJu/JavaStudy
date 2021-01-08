import java.util.StringTokenizer;

public class Ex15 {
    public static void main(String[] args){
        String src = "111, 222, 333, 444, 555";
        StringTokenizer st = new StringTokenizer(src, ",");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.println("==============================");

        String expression = "x=100*(200+333)/4";
        //전달하는 인자가 세개일 때 마지막에는 구분자를 출력하느냐 마느냐
        //default 는 false
        st = new StringTokenizer(expression, "+-*/=()", true);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        System.out.println("==============================");

        String data = "1,이순신,90,90,91|2,안중근,100,99,94|3,유관순,100,100,100";
        st = new StringTokenizer(data, "|");
        while(st.hasMoreTokens()){
            StringTokenizer stst = new StringTokenizer(st.nextToken(), ",");
            while(stst.hasMoreTokens()){
                System.out.print(stst.nextToken() + "   ");
            }
            System.out.println();
        }
    }
}
