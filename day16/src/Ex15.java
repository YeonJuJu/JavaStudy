import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex15 {
    public static void main(String[] args){
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = sdf1.parse("2020년 10월 21일");
            System.out.println(sdf2.format(d));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
