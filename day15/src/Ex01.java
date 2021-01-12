import org.jetbrains.annotations.NotNull;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex01 {
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("입력하는 방법 예시: ((12+3*4)+3)");
            System.exit(0);
        }

        Stack<String> stack = new Stack<>();
        String expression = args[0];

        System.out.println("수식 : " + expression);

        try {
            for(int i=0;i<expression.length();i++){
                char ch = expression.charAt(i);
                if(ch == '('){
                    stack.push(ch + "");
                }
                else if(ch ==')'){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println("괄호가 일치합니다.");
            }else{
                System.out.println("괄호가 일치하지 않습니다.");
            }
        }catch (EmptyStackException e){
            System.out.println("괄호가 일치하지 않습니다.");
            e.printStackTrace();
        }
    }
}
