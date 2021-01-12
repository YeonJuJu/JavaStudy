import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex02 {
    public static Queue<String> queue = new LinkedList<>();
    public static final int MAX_SIZE = 5;

    public static void main(String[] args){
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true){
            System.out.print(">");

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().trim();

            try{
                if(input.isEmpty())
                    continue;
                if(input.equalsIgnoreCase("q")){
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                else if(input.equalsIgnoreCase("help")){
                    System.out.println("help - 도움말을 보여줍니다");
                    System.out.println("q 또는 Q 를 입력하면 프로그램을 종료합니다");
                    System.out.println("history - 최근에 입력한 명령어 " + MAX_SIZE);
                }
                else if(input.equalsIgnoreCase("history")){
                    int i = 0;
                    save(input);

                    LinkedList list = (LinkedList) queue;
                    Iterator iter = list.iterator();

                    while(iter.hasNext()){
                        System.out.println(++i + ". " + iter.next());
                    }

                    //System.out.println(queue);
                }
                else{
                    save(input);
                    System.out.println(input);
                }
            }catch (Exception e){
                System.out.println("정확히 입력해 주세요");
                e.printStackTrace();
            }

        }
    }

    public static void save(String input){
        if(!input.equals("")) {
            queue.offer(input);
        }
        if(queue.size() > MAX_SIZE) {
            queue.remove();
        }
    }
}
