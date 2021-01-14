package genericClass;

// Multi type parameter
public class Product<T, M> {
    private T t;
    private M m;

    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        return this.t;
    }
    public void setM(M m){
        this.m = m;
    }
    public M getM(){
        return this.m;
    }
}
