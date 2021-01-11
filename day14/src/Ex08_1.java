import java.util.Vector;

public class Ex08_1 {
    public static void main(String[] args){
        Vector v = new Vector(5);

        v.add("1");
        v.add("2");
        v.add("3");

        printVector(v);

        //.trimToSize() -> 빈 공간을 없애주는 함수
        // size와 capacity의 값을 같게 한다.
        v.trimToSize();
        printVector(v);

        //.setSize() -> vector 사이즈 조정
        v.setSize(7);
        printVector(v);

        //.ensureCapacity() -> vector capacity 조정
        v.ensureCapacity(6);
        printVector(v);

        //.clear() -> 벡터 비우기
        v.clear();
        printVector(v);

    }

    public static void printVector(Vector v){
        System.out.println(v);
        System.out.println("size : " + v.size());           //현재 들어있는 데이터
        System.out.println("capacity : " + v.capacity());   //처음 선언한 벡터의 사이즈
        System.out.println("==============");
    }
}
