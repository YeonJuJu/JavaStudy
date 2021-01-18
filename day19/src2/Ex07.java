/*
    JAVA I/O class 의 상속관계

    1) 공통적인 code 들은 부모 클래스에 둠
    2) 달라져야 하는 부분은 각각의 자손 클래스에 구현  => Overriding


        <Internet 에서 Data 를 읽어오는 경우>
        1) 원본 file 에 InputStream 을 연결함
        2) 생성할 대상 ( Destination ) 에 OutStream 을 연결함
        3) 원본에서 data 를 읽어냄 : in.read()
        4) 읽은 data 를 대상에 써서 내보냄 : out.write()
        5) 더 이상 읽을 data 가 없는 경우, 모든 stream 연결을 해제 : .close()

 */

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex07 {
    public static void main(String[] args){
        InputStream in = null;
        OutputStream out = null;
        URL url = null;

        try {
            // 1) internet connect
            url = new URL("https://pbs.twimg.com/media/ErYkmXyUYAEkhXq?format=jpg&name=large");

            // 2) data read stream
            in = url.openStream();

            // 3) data write stream
            out = new FileOutputStream("jiminSelfie.jpg");

            // 4) byte[] array 사용해 속도 향상
            byte[] buffer = new byte[1024];

            long start = System.currentTimeMillis();

            while(true){
                int count = in.read(buffer);
                if(count == -1){
                    break;
                }
                out.write(buffer, 0, count);
            }

            long end = System.currentTimeMillis();

            System.out.println("process time : " + (end-start));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(out != null)
                    out.close();
                if(in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
