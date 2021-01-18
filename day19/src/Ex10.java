import java.io.IOException;

public class Ex10 {
    public static void main(String[] args){
        byte[] message = new byte[20];

        System.out.print("Enter a message : ");
        try {
            // 읽어온 byte 의 크기를 return
            // enter key(\r\n) 까지 읽음
            int size = System.in.read(message);

            System.out.println("읽어온 byte 의 크기는 " + (size - 1) + " 입니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
