import java.util.Calendar;

public class Ex05 {
    public static void main(String[] args){
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        //Calendar setting
        date1.set(2019, 07, 15);
        System.out.println("date1 은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] +"요일이고, ");
        System.out.println("오늘은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] +"요일이다. ");

        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000l;

        System.out.println("date1 날로 부터 지금까지 " + difference + " 초 경과되었다.");
        System.out.println("date1 날로 부터 지금까지 " + difference/(60*60*24) + " 일 경과되었다.");
    }

    public static String toString(Calendar calendar){
        return calendar.get(Calendar.YEAR)+"년 "+(calendar.get(Calendar.MONTH)+1)+"월 "+calendar.get(Calendar.DAY_OF_MONTH)+"일 ";
    }
}
