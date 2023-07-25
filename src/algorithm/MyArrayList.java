package algorithm;

import java.util.ArrayList;

public class MyArrayList {
    private ArrayList<Object> list;

    public MyArrayList() {
        list = new ArrayList<>();
    }

    public void add(Object item) {
        list.add(item);
    }

    public void remove(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public Object get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        } else {
            System.out.println("Invalid index!");
            return null;
        }
    }

    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();

        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");

//        System.out.println("Before removal:");
//        System.out.println("Size: " + myList.size());
//        System.out.println("Item at index 1: " + myList.get(1));
//
//        myList.remove(1);
//
//        System.out.println("After removal:");
//        System.out.println("Size: " + myList.size());
//        System.out.println("Item at index 1: " + myList.get(1));
    }
}
