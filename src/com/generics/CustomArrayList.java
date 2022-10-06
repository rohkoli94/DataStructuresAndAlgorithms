package com.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        this.data[size++] = num;
        //size++;

    }

    public boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] =  data[i];
        }
        data = temp;
    }

    public int size(){
        return size;
    }

    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index "+index + "size "+size);
        }
        return data[index];
    }
    public void set(int index, int num){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index "+index + "size "+size);
        }
        data[index] = num;
    }
    public void remove(int index){
        // check exception
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index "+index + "size "+size);
        }
        for (int i = index; i < size - 1; i++) {
            data[index] = data[index + 1];
        }
        size--;
    }

    @Override
    public String toString(){
        return "CustomArrayList{ data="+ Arrays.toString(data)+", size="+size+"}" ;
    }

    public static void main(String[] args) {
        CustomArrayList list =  new CustomArrayList();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.set(0,100);
        list.set(1,200);
        System.out.println(list);
        list.remove(0);
        System.out.println(list.get(0));
        // list.size();
//        list.remove(1);
//        list.get(1);
//        list.set(1,100);

    }
}
