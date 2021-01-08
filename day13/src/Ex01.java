import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//예외처리를 그 자리에서 함

public class Ex01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("파일 이름을 입력하시오 : ");
        File file = createFile(scanner.next());
        System.out.println("File Name : " + file.getName());
    }
    public static File createFile(String fileName){

        try {
            if(fileName == null || fileName.equals("")) {
                throw new Exception("파일 이름이 유효하지 않습니다."); }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            fileName = "제목없음.txt";
        }finally {
            File file = new File(fileName);
            createNewFile(file);
            return file;
        }
    }
    public static void createNewFile(File file){
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
