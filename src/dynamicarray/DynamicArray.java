package dynamicarray;

public class DynamicArray {

    private String[] array;
    private int capacity;
    private int length;

    DynamicArray() {
        capacity = 4;
        array = new String[capacity];
        length = 0;
    }

    void add(String value) {
        if(length== capacity){
            resize(2*capacity);
        }
        array[length] = value;
        length ++;
    }

    void resize(int newCapacity){
         String[] newArray = new String[newCapacity];
         for(int i = 0; i < length; i++){
             newArray[i] = array[i];
         }
         array = newArray;
         capacity = newCapacity;
    }

    void remove(int index) {
        if(index>= length) {
            System.out.println("Geht nicht");
            return;
        }
        for(int i = index; i< length; i++) {
            array[i] = array[i +1];
        }
        length = length -1;
        if(length < capacity/4) {
            resize(capacity/2);
        }
    }
}
