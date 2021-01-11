import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex12 {
    public static void main(String[] args){

        //stack 의 pop, queue 의 poll 비교

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        stack.push("0");
        stack.push("1");
        stack.push("2");

        System.out.println("=====stack=====");
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        queue.offer("0");
        queue.offer("1");
        queue.offer("2");

        System.out.println("=====queue=====");
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+ " ");
        }
        System.out.println("\n===============");


    }
}
