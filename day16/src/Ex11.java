//각 달의 마지막 날짜를 구해 배열에 저장

public class Ex11 {
    public static int[] endOfMonth={31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeapYear(int year){
        // 윤년 (Leap Year)
        // => 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않거나
        // 400으로 나누어 떨어지는 년도

        return year%4==0 && year%100!=0 || year%400==0;
    }

    public static String convertDay2Date(int day){
        int year = 1;
        int month = 0;

        while(true){
            int aYear = isLeapYear(year) ? 366 : 365;
            if(day > aYear){
                day -= aYear;
                year++;
            }
            else
                break;
        }

        while(true){
            int endDay = endOfMonth[month];

            //윤년이면서 윤달이 있는 경우 1을 더 증가시킨다.
            if(isLeapYear(year) && month==1)
                endDay++;


            if(day > endDay){
                day -= endDay;
                month++;
            }
            else
                break;
        }

        return year+" - " + (month+1) + " - " + day;
    }

    public static int convertDate2Day(int year, int month, int day){
        //윤년의 수
        int numberOfLeapYear = 0;

        //전 년도까지의 윤년의 수 구하기
        for(int i=1;i<year;i++){
            if(isLeapYear(i)){
                numberOfLeapYear++;
            }
        }

        //전 년도까지의 일수 구하기
        int untilLastYearDayTotal = (year-1) * 365 + numberOfLeapYear;

        //올해의 현재 월까지의 일수 구하기
        int thisYearDaySum = 0;

        for(int i=0;i<month-1;i++){
            thisYearDaySum += endOfMonth[i];
        }

        //윤년이면서 2월이 포함되어있는 경우,
        //1일을 증가시킴
        if(month > 2 && isLeapYear(year))
            thisYearDaySum++;

        thisYearDaySum += day;

        return untilLastYearDayTotal + thisYearDaySum;
    }

    public static String getDayOfWeek(int year, int month, int day){
        // 1: 일요일 ~ 7: 토요일
        // 1 ~ 7 까지의 값을 반환함.

        int resultDay = convertDate2Day(year, month, day)%7 + 1;
        String strDay = "";

        switch (resultDay){
            case 1:
                strDay = "일요일";
                break;
            case 2:
                strDay = "월요일";
                break;
            case 3:
                strDay = "화요일";
                break;
            case 4:
                strDay = "수요일";
                break;
            case 5:
                strDay = "목요일";
                break;
            case 6:
                strDay = "금요일";
                break;
            case 7:
                strDay = "토요일";
                break;
        }

        return strDay;
    }

    public static int dayDifference(int y1, int m1, int d1, int y2, int m2, int d2){
        return Math.abs(convertDate2Day(y1, m1, d1) - convertDate2Day(y2, m2, d2));
    }

    public static void main(String[] args){
        System.out.println("2020. 5. 31 : " + getDayOfWeek(2020, 5, 31));
        System.out.println("2021. 1. 13 : " + getDayOfWeek(2021, 1, 13));

        System.out.println("735778 : " + convertDay2Date(735778));
        System.out.println("2015. 6. 29 : " + convertDate2Day(2015, 6, 29));

        System.out.println("yeonju : " + dayDifference(2021,01,13,1998,04,06));
    }
}
