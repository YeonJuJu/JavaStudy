import java.util.ArrayList;

class Fruit{
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}

class Apple extends Fruit{

}

class Grape extends Fruit{

}

class Toy{
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}

class Box<T>{
    ArrayList<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    public T getItem(int i){
        return list.get(i);
    }

    public int size(){
        return list.size();
    }

    @Override
    public String toString(){
        return list.toString();
    }

}
public class Ex07 {
    public static void main(String[] args){
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Grape> grapeBox = new Box<>();
        Box<Toy> toyBox = new Box<>();

        // Box 의 Generic type 을 Fruit 로 지정했기 때문에
        // Fruit 클래스와 Fruit 를 상속받는 클래스 추가가 가능하다.
        // Toy 클래스는 Fruit 클래스와 아무 상관이 없기 때문에 추가가 불가능하다.
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        toyBox.add(new Toy());
        toyBox.add(new Toy());
        toyBox.add(new Toy());

        // 자식 클래스에서 부모 클래스를 추가하는 것은 불가능하다.
        grapeBox.add(new Grape());
//        grapeBox.add(new Fruit());
//        grapeBox.add(new Apple());

    }
}
