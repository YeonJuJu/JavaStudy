import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat -> Date 형식을 원하는 형식대로 변환

public class Ex13 {
    public static void main(String[] args){
        //today = Wed Jan 13 16:51:43 KST 2021
        Date today = new Date();
        System.out.println(today);

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf5;
        SimpleDateFormat sdf6, sdf7, sdf8, sdf9, sdf10;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss a");

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));

        sdf5 = new SimpleDateFormat("오늘은 올해의 D 번째 날입니다");
        sdf6 = new SimpleDateFormat("오늘은 이달의 d 번째 날입니다");
        sdf7 = new SimpleDateFormat("오늘은 올해의 w 번째 주입니다");
        sdf8 = new SimpleDateFormat("오늘은 이달의 W 번째 주입니다");
        sdf9 = new SimpleDateFormat("오늘은 이달의 F 번째 E요일 입니다");

        System.out.println(sdf5.format(today));
        System.out.println(sdf6.format(today));
        System.out.println(sdf7.format(today));
        System.out.println(sdf8.format(today));
        System.out.println(sdf9.format(today));

    }
}
