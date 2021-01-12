import java.util.HashSet;
import java.util.Iterator;

public class Ex13 {
    public static void main(String[] args){
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");

        setB.add("3");
        setB.add("4");
        setB.add("5");
        setB.add("6");

        System.out.println("setA : " + setA);
        System.out.println("setA : " + setB);

        Iterator iter = setB.iterator();
        while(iter.hasNext()){
            Object tmp = iter.next();
            if(setA.contains(tmp))
                setKyo.add(tmp);
        }
        System.out.println("Kyo(A∩B) : " + setKyo);

        iter = setA.iterator();
        while(iter.hasNext()){
            Object tmp = iter.next();
            if(!setB.contains(tmp))
                setCha.add(tmp);
        }
        System.out.println("Cha(A-B) : " + setCha);

        iter = setA.iterator();
        while(iter.hasNext()){
            Object tmp = iter.next();
            setHab.add(tmp);
        }
        iter = setB.iterator();
        while(iter.hasNext()){
            Object tmp = iter.next();
            if(!setHab.contains(tmp))
                setHab.add(tmp);
        }

        System.out.println("Hab(AUB) : " + setHab);
    }
}
