package utility;

import java.util.NoSuchElementException;

/*****************************************************************
 * This class MyStack implements a LIFO data structure using a
 * Singly Linked List (SLL).
 *****************************************************************/

public class MyStack<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public MyStack() {
        first = null;
        last = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        if(isEmpty())
            throw new NoSuchElementException("Stack is Empty");

        return last.data;
    }

    public E pop() {
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is empty!");
        }
        E lastItem      = last.data;
        Node<E> oldLast = last;
        last            = last.next;
        oldLast.next    = null;
        size--;
        return lastItem;
    }

    @SuppressWarnings("Convert2Diamond")
    public E push(E item) {
        Node<E> oldLast = last;
        Node<E> newNode = new Node<E>(oldLast, item);
        last = newNode;

        if (isEmpty()) {
            first = newNode;
        }
        size++;
        return last.data;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if(isEmpty()) {
            return"[]";
        } else {
            ArrayList<E> list = new ArrayList<>();
            for (Node<E> node = last; node != null; node = node.next) {
                list.add(node.data);
            }
            int lastIndex = size - 1;

            StringBuilder result = new StringBuilder("[" + list.get(lastIndex));
            for (int i = lastIndex - 1; i >= 0; i--) {
                result.append(", ").append(list.get(i));
            }
                return result.append("]").toString();
        }
    }

    private static class Node<E>{
        Node<E> next;
        E       data;

        @SuppressWarnings("unused")
        public Node(E data) {
            this(null, data);
        }

        public Node(Node<E> next, E data) {
            this.next = next;
            this.data = data;
        }
    }


}
