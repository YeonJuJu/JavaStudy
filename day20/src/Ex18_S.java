import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex18_S {
    public static void main(String[] args){
        ServerSocket svSocket = null;
        Socket sSocket = null;
        OutputStream out = null;
        DataOutputStream dos = null;

        try {
            svSocket = new ServerSocket(8888);
            System.out.println(getTime() + " : Server Socket Waits for connect to client socket");

            // 요청 대기 시간 5초로 설정
            // 5초 동안 접속이 없으면 SocketTimeoutException 발생함
            svSocket.setSoTimeout(10*1000);
            sSocket = svSocket.accept();
            System.out.println(getTime() + " : " + sSocket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");

            System.out.println("getPort() : " + sSocket.getPort());
            System.out.println("getLocalPort() : " + sSocket.getLocalPort());

            // data 를 보내는 작업
            // Server 측 소켓에서 OutputStream 생성
            out = sSocket.getOutputStream();
            dos = new DataOutputStream(out);

            // 원격 소켓에 data 를 보냄
            // 원격 소켓(remote socket - 클라이언트 측 소켓)
            dos.writeUTF("[알림] 서버에서 보내는 메시지 테스트 - 1");

            dos.close();
        } catch (SocketTimeoutException e){
            System.out.println(getTime() + " : 지정된 시간 동안 접속 요청이 없어서 서버를 종료합니다.");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
        return sdf.format(new Date());
    }
}
