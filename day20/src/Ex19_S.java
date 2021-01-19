import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex19_S {
    public static void main(String[] args){
        DataOutputStream dos = null;
        DataInputStream dis = null;
        int serverPort = 9999;
        ServerSocket svSocket = null;
        Socket sSocket = null;

        try {
            svSocket = new ServerSocket(serverPort);
            System.out.println(getTime() + " : Server Socket Waits for connect to client socket");

            sSocket = svSocket.accept();
            System.out.println("서버 측 소켓과 클라이언트 측 소켓이 연결됨");

            // InputStream out = sSocket.getInputStream()
            dis = new DataInputStream(sSocket.getInputStream());
            System.out.println("InputStream 을 생성함");

            // OutputStream out = sSocket.getOutputStream()
            dos = new DataOutputStream(sSocket.getOutputStream());
            System.out.println("OutputStream 을 생성함");

            String messageFromClient = "";

            // 클라이언트가 보낸 메시지 받기
            while(true){
                messageFromClient = dis.readUTF();
                System.out.println("Client message : " + messageFromClient);

                if(messageFromClient.equalsIgnoreCase("q")){
                    System.out.println("대화를 마칩니다");
                    break;
                }

                // 클라이언트에게 메시지 보내기
                dos.writeUTF(messageFromClient);
                dos.flush();
            }

            // 열었던 반대 순으로 닫아줌
            dos.close();
            dis.close();

            sSocket.close();
            svSocket.close();
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
