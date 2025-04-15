public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[10];
        size = 0;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }

    @Override
    public void add(T item) {
        if (size == data.length) resize();
        data[size++] = item;
    }

    @Override
    public T get(int index) {
        return (T) data[index];
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    public void set(int i, T item) {}
    public void add(int i, T item) {}
    public void addFirst(T item) {}
    public void addLast(T item) {}
    public T getFirst() { return null; }
    public T getLast() { return null; }
    public void removeFirst() {}
    public void removeLast() {}
    public void sort() {}
    public int indexOf(Object object) { return -1; }
    public int lastIndexOf(Object object) { return -1; }
    public boolean exists(Object object) { return false; }
    public Object[] toArray() { return null; }
    public void clear() {}
    public java.util.Iterator<T> iterator() { return null; }
}
