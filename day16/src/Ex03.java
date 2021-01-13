import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex03 {
    public static void main(String[] args){
        String[] data = {"A", "K", "A", "B", "C", "C", "C", "A", "B", "A", "A", "A", "G", "K"};

        HashMap<String, Integer> map = new HashMap<>();
        //└>(알파벳, 개수) ((실제로는 객체의 주소들이 들어감))

        for(int i=0;i<data.length;i++){
            if(map.containsKey(data[i])){
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i], new Integer(value.intValue() + 1));
            }
            else{
                map.put(data[i], 1);
            }
        }

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            Map.Entry me = (Map.Entry) iterator.next();
            //문자 : 들어있는 개수 ->  개수만큼 '*' 출력
            int value = ((Integer)me.getValue()).intValue();
            System.out.println(me.getKey() + " : " + value +" " + printChar('*', value));
        }

    }

    public static String printChar(char ch, int value){
        char[] charBar = new char[value];
        for(int i=0;i<charBar.length;i++){
            charBar[i] = ch;
        }
        return new String(charBar);
    }

}
