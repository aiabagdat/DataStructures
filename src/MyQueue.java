public class MyQueue<T extends Comparable<T>> {
    private MyArrayList<T> list = new MyArrayList<>();

    public void enqueue(T item) {
        list.add(item);
    }

    public T dequeue() {
        if (list.size() == 0) return null;
        T val = list.get(0);
        list.remove(0);
        return val;
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }
}
