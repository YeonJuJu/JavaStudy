import java.text.MessageFormat;

//Message Format
//{index number}
public class Ex01 {
    public static void main(String[] args){
        String message = "Name : {0} \nPhone : {1}\nAge : {2}\nBirthday : {3}";
        Object[] arguments1 = {"이순신", "010-1234-5678", "48", "04/25"};
        Object[] arguments2 = {"유관순", "010-6265-5678", "19", "03/01"};
        String result1 = MessageFormat.format(message, arguments1);
        String result2 = MessageFormat.format(message, arguments2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
