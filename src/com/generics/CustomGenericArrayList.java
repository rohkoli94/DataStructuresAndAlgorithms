package com.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList(){
        this.data = new Object[this.DEFAULT_SIZE];
    }

    // add method
    public void add(T element){
        // check full size , if yues resize
        if(size == data.length){
            resize();
        }
        this.data[size++] = element;
    }


    public void resize(){
        Object[] temp = new Object[2* data.length];
        for (int i = 0; i < data.length; i++) {
            temp[i] =  data[i];
        }
        data = temp;
    }

    // remove
    public void remove(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("size "+size +"index "+index);
        }
        for (int i = index; i < size - 1; i++) {
            this.data[i] = this.data[i+1];
        }
        size--;
    }

    // remove last and return removed element
    public T removeLast(){
        T removedelement = (T)this.data[--size]; // as Object is bigger and T is smaller so cast
        return removedelement;
    }

    public T get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("size "+size +"index "+index);
        }
        return (T)this.data[index];
    }

    public void set(int index, T element){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("size "+size +"index "+index);
        }
        this.data[index] = element;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString(){
        return "CustomGenericArrayList{" +
                "data="+ Arrays.toString(this.data)+
                ", size "+size +
                " }";
    }

    public static void main(String[] args) {
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(100);
        list.add(200);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        for (int i = 0; i < 15; i++) {
            list.add(200*i);
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
