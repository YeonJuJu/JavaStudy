import java.io.IOException;

public class Ex11 {
    public static void main(String[] args){
        byte[] message = new byte[20];

        System.out.print("Enter a message : ");

        try {
            //read() 메소드는 data 를 읽어오고 읽어온 byte 의 크기 반환
            int size = System.in.read(message);

            System.out.println("읽어온 string 의 크기는 " + size + "bytes 입니다");

            for(int i=0;i<message.length;i++){
                System.out.print(message[i] + " ");
            }
            System.out.println();
            System.out.println();
            for(int i=0;i<message.length;i++){
                System.out.print((char)message[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
