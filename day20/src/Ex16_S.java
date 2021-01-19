
/*
    <Socket 객체 생성하기>
        ㄴ> Server 가 먼저 실행 중에 있어야 생성 가능

    1) ServerSocket 객체
        Server 가 먼저 실행 중인 상태에서 client 에서
        정확한 ip 주소와 port 번호로 접근하는지 살펴보고,
        정확하게 접근하는 경우 Server 측 Socket 객체를 생성하여
        client 측 Socket 객체와 연결할 수 있도록 함

    2) Server 측 Socket 객체
        Server 에서 ServerSocket 객체가 client 측 Socket 의 접속을 기다리다가
        Server 측에서 설정해놓은 ip 와 port 번호와 일치하는 ip, port 정보를
        가지고 있는 client 측 Socket 이 연결을 시도하면 ServerSocket 객체에 있는
        accept() 가 호출되어 Server 측의 Socket 객체를 생성하게 되어 client 측
        Socket 객체와 Server 측 Socket 객체가 연결하게 됨

    3) Client 측 Socket 객체
        Server 측에서 설정해 놓은 ip와 port 번호와
        일치하는 ip, port 정보를 가지고 생성되어서
        Server 측 Socket 객체와 연결됨
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex16_S {
    public static void main(String[] args){
        ServerSocket svSocket = null;
        Socket sSocket = null;

        try {
            svSocket = new ServerSocket(8888);
            System.out.println("Server Socket Waits for connect to client socket");

            // 다음은 클라이언트측 소켓과 연결될 서버측 소켓켓
            sSocket = svSocket.accept();

            // localhost = domain address
            System.out.println("The Server socket calls the accept() method by connecting to Client localhost:8888");

            System.out.println(sSocket);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
