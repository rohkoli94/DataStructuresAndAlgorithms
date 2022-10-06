package com.generics.comparision;

public class Student implements  Comparable<Student>{
    int rollNo;
    float marks;

  @Override
  public String toString(){
      return  marks +"";

  }

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other){
        int diff = (int) (this.marks - other.marks); // ascending
      //  int diff = -(int) (this.marks - other.marks); // descending
        // if 0 means both are equal
        // if > 0 means current object marks is greater
        return diff;
    }
}
