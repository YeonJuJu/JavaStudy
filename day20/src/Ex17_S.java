import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex17_S {
    public static void main(String[] args){
        ServerSocket svSocket = null;
        Socket sSocket = null;
        OutputStream out = null;

        try {
            svSocket = new ServerSocket(8888);
            System.out.println("Server Socket Waits for connect to client socket");

            sSocket = svSocket.accept();
            System.out.println("접속되자마자 서버는 OutputStream 에 data 를 쓰고, 클라이언트는 InputStream 으로 data 를 읽음");

            System.out.println("The Server socket calls the accept() method by connecting to Client localhost:8888");
            System.out.println(sSocket);

            // data 를 보내는 작업
            // Server 측 소켓에서 OutputStream 생성
            out = sSocket.getOutputStream();

            // 클라이언트 쪽으로 보낼 data 를 생성해 byte 배열에 담음
            byte[] arrByte = new String("Hello").getBytes();

            // byte 배열에 담긴 byte 값을 OutputStream 에 씀
            out.write(arrByte);

            out.flush();

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
