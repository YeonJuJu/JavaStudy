import java.util.TreeSet;

public class Ex16 {
    public static void main(String[] args){
        TreeSet set = new TreeSet();
        int[] score = {80,90,50,35,45,65,10,100};

        for(int i=0;i<score.length;i++){
            set.add(score[i]);
        }
        System.out.println(set);

        //50 이전의 data(50 보다 작은 값) 들 출력
        System.out.println(set.headSet(50));

        //50 이후의 data(50 보다 큰 값) 들 출력
        System.out.println(set.tailSet(50));
    }
}
