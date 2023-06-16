package chapter16;

import java.util.Arrays;

public class MyListImplementation implements MyList{

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int size;

    public void MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public Object add(Object element) {
        ensureCapacity(size + 1);
        array[size++] = element;

        return null;
    }

    public void delete(Object element) {
        int index = indexOf(element);
        if (index >= 0) {
            remove(index);
        }
    }

    private void remove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(array, index + 1, array, index, numMoved);
        }
        array[--size] = null;
    }

    public int getCapacity() {
        return array.length;
    }

    @Override
    public int getListSize() {
        return size;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = getCapacity();
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    int indexOf(Object element) {
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


