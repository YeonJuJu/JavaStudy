import java.io.File;
import java.io.IOException;

public class Ex14 {
    public static void main(String[] args){
        // C drive 의 EclipseIo 폴더 속 AAA 폴더 생성

        // 1) 경로를 문자열에 저장 -> File.separator 이용해 해당 시스템에서 사용하는 구분자 지정
        String dirName = "C:" + File.separator + "EclipseIo" + File.separator + "AAA";
        String fileName = "JavaProgramming.txt";

        try{
            File dir = new File(dirName);

            // 2) folder 가 없으면 생성
            if(!dir.exists()){
                dir.mkdir();
            }

            File file = new File(dir, fileName);

            // 3) file 이 없으면 생성
            if(!file.exists()){
                file.createNewFile();
            }

            System.out.println("file name : " + file.getName());
            System.out.println("file path : " + file.getAbsolutePath());
            System.out.println("file directory path : " + dir.getAbsolutePath());
            System.out.println("file size : " + file.length());

            File file2 = null;

            for(int i = 1;i<=8;i++){
                //file2 = new File(dir.getAbsolutePath() + File.separator + "Day-" + i);
                file2 = new File(dir, "Day-"+i);

                if(!file2.exists())
                    file2.mkdirs();
            }

            System.out.println("=================================");

            String[] list = dir.list();

            for(int i=0;i<list.length;i++){
                File file3 = new File(dir, list[i]);

                if(file3.isDirectory()){
                    System.out.println(list[i] + " : folder(" + file3.list().length + ")");
                }
                else if(file3.isFile()){
                    System.out.println(list[i] + " : file("+ file3.length()+"bytes)");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
