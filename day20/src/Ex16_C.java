import java.io.IOException;
import java.net.Socket;

public class Ex16_C {
    public static void main(String[] args){
        Socket cSocket = null;

        try {
            cSocket = new Socket("localhost", 8888);

            //Connect : Socket[addr=localhost/127.0.0.1,port=8888,localport=65324]
            //locathost = 내 포트번호, host = 상대방 포트번호
            System.out.println("Connect : " + cSocket);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
