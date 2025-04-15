class Main {
    public static void main(String[] args) {
        System.out.println("=== MyArrayList Test ===");
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Element at index 1: " + list.get(1)); // 20
        System.out.println("Size: " + list.size());

        System.out.println("\n=== MyStack Test ===");
        MyStack<String> stack = new MyStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Pop: " + stack.pop()); // C
        System.out.println("Peek: " + stack.peek()); // B

        System.out.println("\n=== MyQueue Test ===");
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(100);
        queue.enqueue(200);
        System.out.println("Dequeue: " + queue.dequeue()); // 100
        System.out.println("Dequeue: " + queue.dequeue()); // 200

        System.out.println("\n=== MyLinkedList Test ===");
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        System.out.println("Element at index 1: " + linkedList.get(1)); // two
        linkedList.remove(1);
        System.out.println("Element at index 1 after remove: " + linkedList.get(1)); // three

        System.out.println("\n=== MyMinHeap Test ===");
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(30);
        heap.insert(10);
        heap.insert(20);
        System.out.println("Extract min: " + heap.extractMin()); // 10
        System.out.println("Extract min: " + heap.extractMin()); // 20
        System.out.println("Peek min: " + heap.peek());// 30

        System.out.println("\nExtra Test: LinkedList addFirst/addLast");
        linkedList.addFirst("zero");
        linkedList.addLast("four");
        System.out.println("First: " + linkedList.getFirst());
        System.out.println("Last: " + linkedList.getLast());



    }
}
