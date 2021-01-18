import java.io.*;

public class Ex15 {
    public static void main(String[] args){
        String dirName = "C:\\Users\\uplay\\Github\\day19\\src";
        String fileName = "Ex15.java";

        BufferedReader br = null;

        try {
            File dir = new File(dirName);
            File file = new File(dirName, fileName);

            System.out.println("file name : " + file.getName());
            System.out.println("file path : " + file.getAbsolutePath());
            System.out.println("file directory path : " + dir.getAbsolutePath());
            System.out.println("file size : " + file.length());

            System.out.println("===============================");

            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

            String contents = null;

            while(true){
                contents = br.readLine();
                if(contents == null)
                    break;
                System.out.println(contents);
            }
        }catch (Exception e){

        }finally {
            //맨 바깥의 객체만 닫으면 속에 있는 것도 다 닫힘
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
