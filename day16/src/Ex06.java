import java.util.Calendar;

public class Ex06 {
    public static void main(String[] args){
        Calendar date = Calendar.getInstance();

        date.set(2019, 8-1, 31);
        System.out.println(toString(date));

        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        //roll 과 add 의 차이 ->
        // add 는 그 다음 달로 넘어가는 것이고, roll 은 그 달내에서 돌고 도는 것
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));

        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+date.get(Calendar.DAY_OF_MONTH)+"일 ";
    }
}
