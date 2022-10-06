package com.oop.access;

public class ObjectDemo {
    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public String toString(){
            return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo();
        int n = obj.hashCode();
        System.out.println(n);
    }
}
