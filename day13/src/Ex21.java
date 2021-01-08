import java.util.Random;

public class Ex21 {
    public static void main(String[] args){
        Random random1 = new Random(1);
        Random random2 = new Random(1); // 1: seed data

        //다음 두 개는 객체가 다르지만 값이 똑같이 나온다.

        System.out.println("rand1");
        for(int i=0;i<5;i++){
            System.out.println( i + " : " + random1.nextInt());
        }

        System.out.println("rand2");
        for(int i=0;i<5;i++){
            System.out.println( i + " : " + random2.nextInt());
        }

        System.out.println("==========================");

        Random rand = new Random();
        int[] number = new int[20];
        int[] counter = new int[10];

        for(int i=0;i<number.length;i++){
            //rand.nextInt(10) : Math.random()*10
            System.out.print((number[i] = rand.nextInt(10)) + " ");
            counter[number[i]]++;
        }
        System.out.println();

        for(int i=0;i<counter.length;i++){
            System.out.println(i + "의 개수 : " + printGraph('#', counter[i]) + " " + counter[i]);
        }
        System.out.println();
    }

    public static String printGraph(char ch, int value){
        char[] graph = new char[value];
        for(int i=0;i<graph.length;i++){
            graph[i] = ch;
        }
        return new String(graph);
    }
}
