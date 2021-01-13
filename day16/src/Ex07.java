import java.util.Calendar;

public class Ex07 {
    public static void main(String[] args){
        Calendar date = Calendar.getInstance();

        date.set(2015, 1-1, 31);
        System.out.println(toString(date));

        //roll 을 이용해 Month 를 증가시키면 그 해 내에서 돈다.
        date.roll(Calendar.MONTH, 14);
        System.out.println(toString(date));

        date.add(Calendar.MONTH, 14);
        System.out.println(toString(date));

    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+date.get(Calendar.DAY_OF_MONTH)+"일 ";
    }
}
