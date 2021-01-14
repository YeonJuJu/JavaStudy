package inheritance;

public class StorageImpl<T> implements Storage<T>{
    private T[] array;

    public StorageImpl(int capacity){
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T item, int idx) {
        array[idx] = item;
    }

    @Override
    public T getT(int idx) {
        return array[idx];
    }

    @Override
    public T[] getT() {
        return array;
    }
}
