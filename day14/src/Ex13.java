import java.util.Stack;

public class Ex13 {
    public static Stack back = new Stack<>();
    public static Stack forward = new Stack<>();

    public static void printStatus(){
        System.out.println("back : " + back);
        System.out.println("forward : " + forward);
        System.out.println("now : " + back.peek());
        System.out.println("=============================");
    }

    public static void moveURL(String url){
        back.push(url);
        if(!forward.empty()){
            forward.clear();
        }
    }

    public static void moveForward(){
        if(!forward.empty()){
            back.push(forward.pop());
        }
    }

    public static void moveBack(){
        if(!back.empty()){
            forward.push(back.pop());
        }
    }

    public static void main(String[] args){
        //Stack을 이용하여 웹 브라우저 앞으로 가기 뒤로 가기 구현
        moveURL("1.www.naver.com");
        moveURL("2.www.nate.com");
        moveURL("3.www.google.com");
        moveURL("4.www.youtube.com");
        printStatus();

        System.out.println("뒤로가기 한번");
        moveBack();
        printStatus();

        System.out.println("뒤로가기 두번");
        moveBack();
        moveBack();
        printStatus();

        System.out.println("앞으로 가기 한번");
        moveForward();
        printStatus();


        System.out.println("앞으로 가기 두번");
        moveForward();
        moveForward();
        printStatus();

    }
}
