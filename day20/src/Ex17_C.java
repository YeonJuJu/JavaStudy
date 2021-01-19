import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Ex17_C {
    public static void main(String[] args){
        Socket cSocket = null;
        InputStream in = null;

        try {
            // ip 와 port 번호로 서버쪽으로 접속을 시도함
            cSocket = new Socket("localhost", 8888);
            System.out.println("연결됨 : " + cSocket);

            // 서버에서 전송한 data 를 읽어들임
            // InputStream 생성
            in = cSocket.getInputStream();

            // data 를 읽어와서 담을 byte 배열 생성
            byte[] buffer = new byte[10];

            // buffer 에 data 를 담음
            // count 에 data 의 개수를 저장
            int count = in.read(buffer);
            System.out.println("count : " + count);

            // byte 배열에 담은 data 를 문자열로 받아서
            // console 에 출력하기
            String str = new String(buffer);
            System.out.println(str);

            in.close();
            cSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
