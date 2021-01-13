
// 숫자를 형식화 하는 클래스 : DecimalFormat

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex12 {
    public static void main(String[] args){
        DecimalFormat decimalFormat1 = new DecimalFormat("#,###.##");
        DecimalFormat decimalFormat2 = new DecimalFormat("#.###E0");

        try {
            Number num = decimalFormat1.parse("1,234,567.89");
            System.out.print("1,234,567.89 -> ");

            //Double type 으로 형 변환
            double d = num.doubleValue();
            System.out.print(d + " -> ");

           System.out.print(decimalFormat2.format(num) + " -> ");
           System.out.print(decimalFormat1.format(num));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
