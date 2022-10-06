package com.oop.inheritance;

public class WeightBox extends Box{
    double weight;

    WeightBox(){
        super();
        System.out.println("cons called of parent - BOXWEIGHT");
        this.weight = -30;
//        System.out.println("child weight"+this.weight);
//        System.out.println("parent weight "+super.weight);
    }
    WeightBox(double length, double width, double height, double weight){
       // super(length,width,height);
        this.weight  = weight;

    }
    WeightBox(WeightBox obj) {
    super(obj); // allowed as it is equivalent to PARENT can create CHILD OBJECT But Parent can only access parents variables
    }
    }
