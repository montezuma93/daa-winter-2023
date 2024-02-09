package dynamicarray;

import datenstructur.Animal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("Test");
        dynamicArray.add("Test1");
        dynamicArray.add("Test2");
        dynamicArray.add("Test3");
        dynamicArray.add("Test4");
        dynamicArray.add("Test5");

        dynamicArray.remove(1);
        dynamicArray.remove(2);
        dynamicArray.remove(3);
        dynamicArray.remove(1);
        dynamicArray.remove(1);
        dynamicArray.remove(0);

    }
}
