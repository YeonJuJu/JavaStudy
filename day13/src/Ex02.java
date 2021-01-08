import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//예외처리를 호출한 쪽에서 처리함

public class Ex02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("파일 이름을 입력하시오 : ");
        File file = null;
        try {
            file = createFile(scanner.next());
            System.out.println("File Name : " + file.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주세요.");
        }

    }
    public static File createFile(String fileName) throws Exception{
        if(fileName == null || fileName.equals("")) {
            throw new Exception("파일 이름이 유효하지 않습니다.");
        }
        File file = new File(fileName);
        file.createNewFile();
        return file;
    }
    public static void createNewFile(File file){
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
