import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex14 {
    public static void main(String[] args){
        InetAddress ip = null;
        InetAddress[] arrIp = null;

        try {
            ip = InetAddress.getByName("www.naver.com");
            System.out.println("getHostName() : " + ip.getHostName());
            System.out.println("getHostAddress() : " + ip.getHostAddress());
            System.out.println("ip : " + ip.toString());

            System.out.println("=========================================");

            ip = InetAddress.getLocalHost();
            System.out.println("getHostName() : " + ip.getHostName());
            System.out.println("getHostAddress() : " + ip.getHostAddress());

            System.out.println("=========================================");

            arrIp = InetAddress.getAllByName("www.naver.com");
            for(int i=0;i<arrIp.length;i++){
                System.out.println("arrIp[" + i + "] : " + arrIp[i]);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
