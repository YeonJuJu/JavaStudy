import java.util.Calendar;

//입력된 년, 월을 이용해 해당 달력 출력
public class Ex08 {
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("입력 예시 : 2020 10");
            System.exit(0);
        }

        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);

        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        //endDay 는 startDay 보다 한 달 뒤로 설정
        Calendar startDay = Calendar.getInstance();
        Calendar endDay = Calendar.getInstance();

        startDay.set(year, month-1, 1);
        endDay.set(year, month, 1);

        //startDay 달에 마지막 일 계산(?)
        endDay.add(Calendar.DATE, -1);

        //startDay 달 1일에 요일 계산
        START_DAY_OF_WEEK = startDay.get(Calendar.DAY_OF_WEEK);

        //해당 달 마지막 날짜 (29,30,31) 계산
        END_DAY = endDay.get(Calendar.DATE);

        System.out.println("      " + args[0] + "년 " + args[1] + "월 ");
        System.out.println(" SU MO TU WE TH FR SA");

        for(int i=1;i<START_DAY_OF_WEEK;i++){
            System.out.print("   ");
        }

        for(int i=1, n=START_DAY_OF_WEEK;i<=END_DAY;i++, n++){
            System.out.print((i<10)?"  "+i:" "+i);
            if(n%7==0)
                System.out.println();
        }


    }
}
