package com.oop.cloning;

public class CloneDemo implements Cloneable{

  int rollno;
  String name;
  int[] arr;

    public CloneDemo(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        this.arr = new int[]{1,2,3,4};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone(); // shallow copy
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //DEEP COPY
        CloneDemo twin = (CloneDemo)super.clone(); // shallow copy
        twin.arr = new int[this.arr.length];

        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
