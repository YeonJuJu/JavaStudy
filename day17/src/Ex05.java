public class Ex05 {
    public static void main(String[] args){
        Person person1 = new Person();

        person1.setObject("이순신");
        System.out.println(person1.getObject());
        // 하지만 String type 의 변수로 저장할 때에는
        // 기본 Object 타입을 원하는 타입으로 캐스팅 해주어야 한다.
        String name = (String) person1.getObject();

        person1.setObject(12);
        System.out.println(person1.getObject());
        // 하지만 int type 의 변수로 저장할 때에는
        // 기본 Object 타입을 원하는 타입으로 캐스팅 해주어야 한다.
        int age = (int) person1.getObject();
    }
}

// Generic 을 사용하지 않고, Object type 사용
class Person{
    private Object object;

    public Person(){}
    public Person(Object object){
        this.object = object;
    }
    public Object getObject(){
        return object;
    }
    public void setObject(Object object){
        this.object = object;
    }
}