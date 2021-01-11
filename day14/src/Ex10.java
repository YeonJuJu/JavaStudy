import java.util.LinkedList;

public class Ex10 {
    public static void main(String[] args){
        LinkedList<Integer> stack = new LinkedList<>();

        stack.addLast(new Integer(12));
        stack.addLast(52);
        stack.addLast(8);
        stack.addLast(22);

        System.out.println("stack : " + stack);
        System.out.println("=================");

        int number = stack.getLast();
        System.out.println("stack's top : " + number);
        System.out.println("stack : " + stack);
        System.out.println("=================");

        while (!stack.isEmpty()){
            number = stack.removeLast();
            System.out.println("stack's top : " + number);
            System.out.println("stack : " + stack);
            System.out.println("=================");
        }
    }
}
