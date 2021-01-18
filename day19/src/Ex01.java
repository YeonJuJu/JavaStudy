import java.util.ArrayList;

class Table{
    String[] dishNames = {"donut", "donut", "burger"};

    //음식 담을 수 있는 최대 개수
    final int MAX_FOOD = 6;

    //음식 담는 array
    private ArrayList<String> dishes = new ArrayList<>();

    //음식 추가하기
    public void add(String dish){
        if(dishes.size() >= MAX_FOOD){
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes : " + dishes);
    }

    //지정된 음식을 array에서 꺼내기
    public boolean remove(String dishName){
        for(int i=0;i<dishes.size();i++){
            if(dishName.equals(dishes.get(i))){
                dishes.remove(i);
                return true;
            }
        }
        return false;
    }

    //음식의 개수
    public int dishNum() {
        return dishNames.length;
    }
}

class Customer implements Runnable{
    private Table table;
    private String food;

    public Customer(Table table, String food){
        this.table = table;
        this.food = food;
    }

    public boolean eatFood(){
        return table.remove(food);
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(10);
                String name = Thread.currentThread().getName();
                if(eatFood())
                    System.out.println(name + " ate a " + food);
                else
                    System.out.println(name + " failed to eat...");
            } catch (InterruptedException e) {

            }
        }
    }
}

class Cooker implements Runnable{
    private Table table;
    public Cooker(Table table){
        this.table = table;
    }

    @Override
    public void run(){
        while(true){
            int num = (int) (Math.random()*table.dishNum());
            table.add(table.dishNames[num]);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Ex01 {
    public static void main(String[] args){
        // 여러 스레드가 공유하는 공유객체
        Table table = new Table();

        new Thread(new Cooker(table), "cooker1").start();
        new Thread( new Customer(table, "donut"), "customer1").start();
        new Thread( new Customer(table, "burger"), "customer2").start();

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}

        System.out.println(Thread.currentThread().getName() + " 종료");
        System.exit(0);
    }
}
