public class Ex04 {
    public static void main(String[] args){
        try{
            startInstall(); // 프로그램 설치시 필요한 준비 작업
            copyFiles();    // 프로그램 설치시 필요한 파일들 복사하기
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            deleteTempFiles();
        }
    }
    public static void startInstall(){

    }
    public static void copyFiles(){

    }
    public static void deleteTempFiles(){

    }
}
