import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Ex11 {
    public static void main(String[] args){
        //LinkedHashSet 은 순서를 보장함. 링크로 연결되어있기 때문
        Set set = new LinkedHashSet();

        int[][] board = new int[5][5];

        for(int i=0;set.size() < 25; i++){
            set.add((int) (Math.random()*50 + 1) + "");
        }
        System.out.println(set);
        System.out.println("=============================");

        Iterator iterator = set.iterator();

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j] = Integer.parseInt((String) iterator.next());
                System.out.printf("%2d " , board[i][j]);
            }
            System.out.println();
        }
    }
}
