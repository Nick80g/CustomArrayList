package org.example;


import java.util.*;



public class CustomArrayList<T> {

    private int size;

    private T[] arr;

    public CustomArrayList() {
        arr = (T[]) new  Object[10];
    }

    /**
     * Метод добавления элемента в коллекцию.
     */
    public void add(T t) {
        arr[size] = t;
        size++;
        if(arr.length  == size) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
    }
    /**
     * Метод добавления элемента в коллекцию по индексу.
     */
    public void add(int index, T t) {
        if(index < 0 || index > size) {
            throw new  IndexOutOfBoundsException("Wrong index.");
        }
        if(index == size){
            arr[size] = t;
            size++;
            return;
        }
        for (int i = size; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = t;
    }

    /**
     * Метод возвращает размер коллекции.
     */
    public int getSize(){
        return size;
    }
    /**
     * Метод очищает коллекцию.
     */
    public void clear() {
        arr = Arrays.copyOf(arr, 10);
        Arrays.fill(arr, null);
        size = 0;
    }

    /**
     * Метод возвращает элемент по индексу.
     */
    public T get(int index) {
        if(index < 0 || index > size) {
            throw new  IndexOutOfBoundsException("Wrong index.");
        }
        return (T)arr[index];
    }
    /**
     * Метод удаляет элемент из коллекции по индексу.
     */
    public T remove(int index) {
        if(index < 0 || index > size) {
            throw new  IndexOutOfBoundsException("Wrong index.");
        }
        T t = (T) arr[index - 1];
        if(index == size){
            arr[size] = null;
            size--;
            return t;
        }
        for (int i = index; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        arr[size] = null;
        size--;
        return t;
    }
    /**
     * Метод сортирует коллекцию на основе компоратора.
     */
    public  void  sort(Comparator<T> comparator){
        for (int j = 0; j < size; j++) {
            for (int i = 1; i < size ; i++) {
                int result = comparator.compare(arr[i], arr[i - 1]);
                if(result < 0){
                    T temp = arr[i];
                    arr[i ] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }
    }
}
