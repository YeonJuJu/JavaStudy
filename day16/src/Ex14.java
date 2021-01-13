import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex14 {
    public static void main(String[] args){
        // Calendar 와 Date 간의 변환
        Calendar cal = Calendar.getInstance();
        cal.set(2020, 10, 27); // 2020년 11월 27일

        Date day = cal.getTime();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm.sss a");

        System.out.println(sdf1.format(day));
        System.out.println(sdf2.format(day));
        System.out.println(sdf3.format(day));
        System.out.println(sdf4.format(day));
    }
}
