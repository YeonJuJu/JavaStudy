import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class _Client01 {
    public static void main(String[] args){
        Socket cSocket = null;
        String localhost = "127.0.0.1";
        int serverPort = 9999;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        Scanner scanner = null;


        try {
            cSocket = new Socket(localhost, serverPort);

            // 출력 스트림 준비
            dos = new DataOutputStream(cSocket.getOutputStream());
            System.out.println("OutputStream 생성");

            // 입력 스트림 준비
            dis = new DataInputStream(cSocket.getInputStream());
            System.out.println("InputStream 생성");

            String messageFromServer = null;
            String messageToServer = null;

            scanner = new Scanner(System.in);

            while(true){
                System.out.print("Cilent message : ");
                messageToServer = scanner.nextLine();

                dos.writeUTF(messageToServer);
                dos.flush();

                if(messageToServer.equalsIgnoreCase("q")){
                    System.out.println("대화를 마칩니다.");
                    break;
                }

                messageFromServer = dis.readUTF();
                System.out.println("Server message : " + messageFromServer);

                if(messageFromServer.equalsIgnoreCase("q")){
                    System.out.println("대화를 마칩니다.");
                    break;
                }
            }

            dos.close();
            scanner.close();
            dis.close();
            cSocket.close();
        } catch (EOFException e){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
