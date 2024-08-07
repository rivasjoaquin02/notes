import java.util.Iterator;

public class Queue <T> implements Iterable <T> {

    private int size=0;
    private Node <T> head;
    private Node <T> tail;

    private class Node<T>{
        T data;
        Node <T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    public Queue(){
        head = tail = new Node<T>(null,  null);
    }

    public int size(){return size;}
    public boolean isEmpty(){return size() > 0;}

    // append
    public void enqueue(T data){
        Node <T> new_node = new Node<T>(data, null);
        if (isEmpty()){
            head = new_node;
        }
        tail.next = new_node;
        tail = new_node;
        size++;
    }
    // pop left
    public T dequeue(){
        if (isEmpty())
            throw new RuntimeException("queue is empty");
        T data = head.data;
        head = head.next;

        return data;
    }
    // return first without pop
    public T peek(){
        return head.data;
    }

    public int contains(T data){
        if (isEmpty())
            throw new RuntimeException("queue is empty");
        int i;
        Node <T> trav;
        for (trav = head, i=0; trav!=data; trav = trav.next, i++)
            if (trav.data.equals(data)) return i;
        return -1;
    }
    public void remove(T data) throws Exception {
        if (isEmpty())
            throw new RuntimeException("queue is empty");
        int i;
        Node <T> trav;

        for (trav = head, i=0; trav!=data; trav = trav.next, i++)
            if (trav.next.data.equals(data)){
                trav.next = trav.next.next;
                return;
            }
        throw new Exception("element don't find");
    }

    public Iterator <T> {
        return new Iterator<T>(){
            public boolean hasNext(){}
            public T next(){}
        }
    }

}
