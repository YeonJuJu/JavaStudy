import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args){
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner scanner = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 " + pattern + " 형식으로 입력해 주세요");

        while(scanner.hasNextLine()){
            try {
                inDate = df.parse(scanner.nextLine());
                break;
            } catch (ParseException e) {
                System.out.println("날짜를 " + pattern + " 형식으로 입력해 주세요");
                e.printStackTrace();
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);

        Calendar today = Calendar.getInstance();
        long day = (long)(cal.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000);

        System.out.println("입력하신 날짜는 현재와 " + day +" 시간 차이가 있습니다.");
    }
}
