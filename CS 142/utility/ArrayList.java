package utility;

import java.util.NoSuchElementException;

/*****************************************************************
 * This class ArrayList implements a contiguous block of data
 * using an array.
 *****************************************************************/

public class ArrayList<E> implements List<E> {

    public static final int DEFAULT_CAPACITY = 10;

    private E[] data;
    private int size;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity) {
        String message = "Illegal Capacity CANNOT be negative " + capacity;

        if (capacity < 0)
            throw new IllegalArgumentException(message);

        data = (E[]) new Object[capacity];
        size = 0;
    }

    @Override
    public boolean add(E item) {
        ensureCapacity(size + 1);
        int oldSize = size;
        data[size++] = item;
        return size == (oldSize + 1);
    }

    @Override
    public void add(int index, E item) {
        if (index == size) {
            add(item);
        } else {
            checkIndex(index);
            ensureCapacity(size + 1);
            shiftRight(index);
            data[index] = item;
            size++;
        }
    }

    private void checkIndex(int index) {
        String message = "Invalid Index: " + index + ", size: " + size;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(message);
        }
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public boolean contains(E item) {
        return indexOf(item) != -1;
    }

    @SuppressWarnings("unchecked")
    public void ensureCapacity(int capacity) {
        if (capacity > data.length) {
            int newLength = Math.max(2 * data.length + 1, capacity);
            E[] newArray = (E[]) new Object[newLength];

            if (size >= 0) System.arraycopy(data, 0, newArray, 0, size);
            data = newArray;
        }
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    @Override
    public int indexOf(E item) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator();
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E oldItem = data[index];
        shiftLeft(index);
        data[size - 1] = null;
        size--;
        return oldItem;
    }

    @Override
    public boolean remove(E item) {
        if (contains(item)) {
            E oldItem = remove(indexOf(item));
            return item.equals(oldItem);
        }
        return false;
    }

    private void shiftLeft(int index) {
        if (size - index >= 0) System.arraycopy(data, index + 1, data, index, size - index);
    }

    private void shiftRight(int index) {
        if (size - index >= 0) System.arraycopy(data, index, data, index + 1, size - index);
    }

    @Override
    public E set(int index, E item) {
        checkIndex(index);
        E oldItem = data[index];
        data[index] = item;
        return oldItem;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        } else {
            StringBuilder result = new StringBuilder("[" + data[0]);
            for (int i = 1; i < size; i++)
                result.append(", ").append(data[i]);
            return result.append("]").toString();
        }
    }

    private class ArrayIterator implements Iterator<E> {
        int position;
        boolean isRemovable;

        public ArrayIterator() {
            position = 0;
            isRemovable = false;
        }

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public E next() {
            String message = "No more elements left!";
            if (!hasNext())
                throw new NoSuchElementException(message);

            E currentItem = data[position];
            position++;
            isRemovable = true;
            return currentItem;
        }

        @Override
        public void remove() {
            String message = "Unable to remove.";
            if (!isRemovable)
                throw new IllegalStateException(message);

            ArrayList.this.remove(position - 1);
            isRemovable = false;
        }
    }
}