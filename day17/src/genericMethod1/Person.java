package genericMethod1;

public class Person<T> {
    private T t;
    public T getT(){
        return this.t;
    };
    public void setT(T t){
        this.t = t;
    }
}
