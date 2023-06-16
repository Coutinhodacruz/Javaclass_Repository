package chapter16;

import java.util.Arrays;

public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(Object element) {
        ensureCapacity(size + 1);
        array[size++] = element;
    }

    public void delete(Object element) {
        int index = indexOf(element);
        if (index >= 0) {
            remove(index);
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            array[--size] = null;
            reduceCapacity(size);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public Object get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public int getCapacity() {
        return array.length;
    }

    public int getListSize() {
        return size;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = getCapacity();
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity + (oldCapacity / 2);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    private void reduceCapacity(int minCapacity) {
        int oldCapacity = getCapacity();
        if (minCapacity < oldCapacity / 2 && oldCapacity > DEFAULT_CAPACITY) {
            int newCapacity = Math.max(oldCapacity / 2, DEFAULT_CAPACITY);
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    public int indexOf(Object element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(array[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
}
