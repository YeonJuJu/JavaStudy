public class Ex10 {
    public static void main(String[] args){
        String date1 = "201908";
        String date2 = "201806";

        //개월 차 구하기
        //년도에 12를 곱한 후
        //월로 변환해서 뺄셈을 함

        int month1 = Integer.parseInt(date1.substring(0,4))*12
                   + Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0,4))*12
                   + Integer.parseInt(date1.substring(4));

    }
}
