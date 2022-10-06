package com.oop.inheritance;

public class BoxPrice extends WeightBox{

    double cost;

    BoxPrice(){
        super();
        System.out.println("cons called of parent - BoxPrice");
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

}
