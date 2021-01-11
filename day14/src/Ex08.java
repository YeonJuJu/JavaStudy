import java.util.*;

public class Ex08 {
    public static void main(String[] args){
        String source = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        final int LIMIT = 8;
        int length = source.length();

        List list = new ArrayList<>(length/LIMIT + 10);

        for(int i=0;i<length;i+=LIMIT){
            try{
                list.add(source.substring(i,i+LIMIT));
            }catch (Exception e){
                list.add(source.substring(i));
            }
        }


        for(Object str : list){
            System.out.println(str);
        }

    }
}
