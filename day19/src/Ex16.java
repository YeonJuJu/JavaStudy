import java.io.*;

public class Ex16 {
    public static void main(String[] args){
        String fileName = "log.txt";

        // 표준 입력 스트림으로부터 문자열 읽어옴
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        File file = new File(fileName);

        PrintWriter pwr = null;


        try {
            if(!file.exists())
                file.createNewFile();

            /*
            FileOutputStream fos = new FileOutputStream(file, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            */

            //=>
            BufferedWriter bwr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));

            pwr = new PrintWriter(bwr);

            char isCheckExit = 'n';
            String message;

            do{
                System.out.print("Enter a message : ");
                message = br.readLine();

                pwr.println("입력된 메시지 : " + message);
                // buffer 를 비우는 명령
                pwr.flush();

                System.out.print("프로그램을 종료하시겠습니까 ? (y/n) : ");
                isCheckExit = (char) br.read();
                br.read();
            }while(isCheckExit != 'y' && isCheckExit !='Y');

            pwr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
