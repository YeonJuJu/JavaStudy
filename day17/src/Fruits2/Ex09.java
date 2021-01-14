package Fruits2;

import java.util.ArrayList;

class Fruit {
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}

class Apple extends Fruit {

}

class Grape extends Fruit {

}

class Juice{
    String name;
    public Juice(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name + " Juice";
    }
}

class Juicer{
    public static Juice makeJuice(FruitBox<? extends Fruit> box){
        String tmp = "";
        for(Fruit fruit : box.getList()){
            tmp = fruit + " ";
        }
        Juice j = new Juice(tmp);
        return j;
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

    public ArrayList<T> getList(){
        return this.list;
    }

    @Override
    public String toString(){
        return list.toString();
    }

}

// Generic type 의 상한 제한
class FruitBox<T extends Fruit> extends Box<T> {

}

public class Ex09 {
    public static void main(String[] args){
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        fruitBox.add(new Apple());
        System.out.println(Juicer.makeJuice(fruitBox));

        fruitBox.add(new Grape());
        System.out.println(Juicer.makeJuice(fruitBox));

        appleBox.add(new Apple());
        System.out.println(Juicer.makeJuice(appleBox));
    }
}
