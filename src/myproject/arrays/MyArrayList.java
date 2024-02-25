package myproject.arrays;

import java.util.Arrays;
public class MyArrayList {
    float[] array;
    int size;

    public MyArrayList() {
        array = new float[10];
        size = 0;
    }

    public MyArrayList(int capacity) {
        array = new float[capacity];
        size = 0;
    }

    public void add(float value) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = value;
        size++;
    }

    public boolean contains(float value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indexul este indisponibil");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public float get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Indexul este indisponibil");
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String resultString ="[ ";
        for (float arrayElement : array){
            if (arrayElement != 0.0){
                resultString += arrayElement + " ";
            }
        }
        return resultString + "]";

    }
}
