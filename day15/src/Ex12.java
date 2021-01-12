import java.util.HashSet;

public class Ex12 {
    public static void main(String[] args){
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        //set은 equals 메소드를 사용해 중복을 제거하기 때문에
        //주소가 다른 David Person 객체들은 다른것으로 인식해 중복되어 삽입된다.
        //이것을 해결하기 위해서는 함수를 overriding 해야한다. (hashCode(), equals())
        //set.add 는 넣은 데이터 자체에서 비교를 하는 것이기 때문에
        //Person 객체 내에서 오버라이딩해줘야함
        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person){
            Person p = (Person) obj;
            if(p.name == this.name && p.age == this.age)
                return true;
            else
                return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return (name + age).hashCode();
    }
}
