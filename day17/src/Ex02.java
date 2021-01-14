import java.text.ChoiceFormat;

//ChoiceFormat
//ChoiceFormat(A,B) -> A 와 B 를 매칭.
// 그 후 .format(data) 으로 들어온 인자를 매칭해서 리턴
public class Ex02 {
    public static void main(String[] args){
        double[] limits = {60, 70, 80, 90};
        String[] grades = {"D", "C", "B", "A"};
        int[] scores = {100, 95, 85, 78, 56, 61, 70};

        ChoiceFormat chf = new ChoiceFormat(limits, grades);

        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i] + " : " + chf.format(scores[i]));
        }
    }
}
