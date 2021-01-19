import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

/*
        URL : Uniform Resource Location
              ㄴ> internet 상에서 여러 server 들이 제공하는 자원에 접근할 수 있는 주소

              protocol://hostname:portNum/path/subPath/fileName?queryString#ref
              (포트번호, 쿼리, 참조는 생략할 수 있음)

        Protocol : 자원에 접근하기 위해서 서버와 통신하는데 사용되는 통신규약
        HostName : 자원을 제공하는 서버의 이름 -> (www.naver.com or IP_Address)
        PortNum  : 통신에 사용되는 서버의 포트번호 (default - 80)
                   65536 개 ( 0 ~ 65535 ) 의 번호 중 0 ~ 1023 번까지 1024 개는 System (OS) 에서 사용
        Path     : 접근하려는 자원이 저장된 서버상에서의 위치
        File     : 접근하려는 자원의 이름 (index.html, address.txt)
        query    : ? 이후 부분 (name=이순신&age=25)

 */

public class Ex15 {
    public static void main(String[] args){
        URL url = null;

        try {
            url = new URL("https://terms.naver.com/entry.nhn?docId=542496&cid=46622&categoryId=46622");

            // host name, port
            System.out.println("url.getAuthority() : " + url.getAuthority());
            // URL 의 Content 객체 반환
            System.out.println("url.getContent() : " + url.getContent());
            // naver 에서 사용하는 기본 포트
            System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
            System.out.println("url.getPort() : " + url.getPort());
            System.out.println("url.getFile() : " + url.getFile());
            System.out.println("url.getHost() : " + url.getHost());
            System.out.println("url.getPath() : " + url.getPath());
            System.out.println("url.getProtocol() : " + url.getProtocol());
            System.out.println("url.getQuery() : " + url.getQuery());
            System.out.println("url.getRef() : " + url.getRef());
            System.out.println("url.getUserInfo() : " + url.getUserInfo());
            System.out.println("url.toExternalForm() : " + url.toExternalForm());
            System.out.println("url.toURI() : " + url.toURI());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
