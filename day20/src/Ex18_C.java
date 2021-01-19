import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex18_C {
    public static void main(String[] args) {
        Socket cSocket = null;
        InputStream in = null;
        DataInputStream dis = null;

        String serverIp = "127.0.0.1";
        System.out.println(getTime() + " : 서버에 연결 중입니다... 서버 ip : " + serverIp);

        try {
            cSocket = new Socket(serverIp, 8888);

            in = cSocket.getInputStream();
            dis = new DataInputStream(in);

            String response = dis.readUTF();
            System.out.println(response);

            dis.close();
        } catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
        return sdf.format(new Date());
    }
}
