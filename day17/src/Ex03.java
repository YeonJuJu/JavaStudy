import java.text.ChoiceFormat;

//ChoiceFormat
//ChoiceFormat(A,B) -> A 와 B 를 매칭.
//ChoiceFormat(A)   -> 문자열을 이용해 매칭 형식 지정 가능
// 그 후 .format(data) 으로 들어온 인자를 매칭해서 리턴
public class Ex03 {
    public static void main(String[] args){
        String pattern = "60#D|70<C|80#B|90#A|";
        int[] scores = {100, 95, 85, 78, 56, 61, 70};

        ChoiceFormat chf = new ChoiceFormat(pattern);

        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i] + " : " + chf.format(scores[i]));
        }
    }
}
