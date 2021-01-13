import java.util.*;

public class Ex01 {
    public static void main(String[] args){
        HashMap map = new HashMap();

        map.put("이순신", 90);
        map.put("안중근", 100);
        map.put("양만춘", 100);
        map.put("김유신", 80);
        map.put("유관순", 90);

        //HashMap Iterator 이용방법
        Set set = map.entrySet();
        //.entrySet() -> HashMap key 와 value 값이 쌍으로 들어가있다.
        //key=value, key=value 같이 들어있음
        System.out.println(set);

        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            //key 와 value 값을 따로 떼어내주기 위해 Map.Entry 사용
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println("이름 : " + me.getKey() + ", 점수 : " + me.getValue());
        }
        System.out.println("============================");

        //점수들만 뽑아내기
        Collection values = map.values();

        iterator = values.iterator();

        int total = 0;
        float average = 0.0f;
        int max = 0;
        int min = 100;

        while(iterator.hasNext()){
            int num = (int) iterator.next();
            max = Math.max(max, num);
            min = Math.min(min, num);
            total += num;
        }
        average = (float)(total/(values.size()));

        System.out.println("max score : " + max);
        System.out.println("min score : " + min);
        System.out.println("score total : " + total);
        System.out.println("score average : " + average);

        System.out.println("============================");

        //Maximum 과 Minimum 구하는 다른 방법
        max = (int) Collections.max(values);
        min = (int) Collections.min(values);

        System.out.println("max score : " + max);
        System.out.println("min score : " + min);
    }
}
