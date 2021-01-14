package inheritance;

public interface Storage<T> {
    public void add(T item, int idx);
    public T getT(int idx);
    public T[] getT();
}
