package utility;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/*****************************************************************
 * This class MyQueue implements a FIFO data structure using a
 * Singly Linked List (SLL).
 *****************************************************************/

public class MyQueue<E> {

    private Node<E> first;
    private Node<E> last;
    private int size;

    public boolean add(E item) {
        int oldSize = size;
        append(item);
        size++;
        return size == (oldSize + 1);
    }

    private void append(E item){
        Node<E> oldLast = last;
        Node<E> newNode = new Node<>(item);
        last = newNode;

        if(isEmpty()){
            first = newNode;
        } else {
            oldLast.next = newNode;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        return isEmpty() ? null : first.data;
    }

    public E remove() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is Empty!");
        } else {
            E firstItem = first.data;
            Node<E> oldFirst = first;
            first = first.next;
            oldFirst.next = null;
            size--;
            return firstItem;
        }
    }

    public int size() {
        return size;
    }

    public static void evensBeforeOdds(MyQueue<Integer> queue) {
        MyQueue<Integer> temp = new MyQueue<>();

        int queueSize = queue.size();

        for (int i = 0; i < queueSize; i++) {
            Integer head = queue.remove();

            (head % 2 == 0 ? queue : temp).add(head);
        }
        while(!temp.isEmpty()) {
            int odd = temp.remove();
            queue.add(odd);
    }
    }

    @Override
    public String toString() {
        if(isEmpty()) {
            return "[]";
        } else {
            ArrayList<E> list = new ArrayList<>();
            StringBuilder result = new StringBuilder("[" + first.data);
            for(Node<E> node = first.next; node != null; node = node.next) {
                list.add(node.data);
            }
            int lastIndex = size - 1;
            for(int i = 0; i < lastIndex - 1; i++) {
                result.append(", ").append(list.get(i));
            }
            return result.append("]").toString();
        }
    }

    private static class Node<E> {
        Node<E> next;
        E data;

        public Node(E data) {
            this(null, data);
        }

        public Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }
    }
}
