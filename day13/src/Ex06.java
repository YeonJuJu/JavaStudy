//catch 중 위에 있는 에러가 catch 되면 그 밑에 있는 에러 catch문은 실행되지 않음

public class Ex06 {
    public static void main(String[] args){
        try {
            startInstall();
            copyFiles();
            System.out.println("설치 성공");
        } catch (SpaceException e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치해 주세요");
        } catch (MemoryException e) {
            System.out.println("에러 메세지 : " + e.getMessage());
            e.printStackTrace();
            System.gc(); // Garbage Collector 호출해 메모리 늘려줌
            System.out.println("설치를 다시 시도해 주세요");
        }finally {
            deleteTempFiles();
        }
        System.out.println("프로그램 종료");
    }
    public static void startInstall() throws SpaceException, MemoryException{
        if(!enoughSpace()){
            throw new SpaceException("설치할 공간이 부족합니다");
        }
        if(!enoughMemory()){
            throw new MemoryException("메모리가 부족합니다");
        }
    }
    public static void copyFiles(){

    }
    public static void deleteTempFiles(){

    }
    public static boolean enoughSpace(){
        // 설치하는데 필요한 HDD 공간이 확보되어있는지 확인
        return true;
    }
    public static boolean enoughMemory(){
        // 설치하는데 필요한 RAM 공간이 확보되어있는지 확인
        return false;
    }
}
class SpaceException extends Exception{
    public SpaceException(String message){
        super(message);
    }
}
class MemoryException extends Exception{
    public MemoryException(String message){
        super(message);
    }
}
