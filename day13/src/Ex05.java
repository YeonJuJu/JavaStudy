public class Ex05 {
    public static void main(String[] args){
        method1();
        System.out.println("method1() 의 수행 종료 후 main() 으로 돌아옴");
    }

    //try 구문에 return 이 있지만, finally 블럭이 실행됨
    public static void method1(){
        try{
            System.out.println("method1() 호출됨");
            return;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("method1() 의 finally 블럭 실행");
        }
    }
}
