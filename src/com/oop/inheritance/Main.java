package com.oop.inheritance;

public class Main {

    public static void main(String[] args) {
//        Box obj1 = new Box(4);
//        Box obj2 = new Box(obj1);
//
//        System.out.println(obj1.length + " "+ obj1.width+" "+ obj1.height);
//        System.out.println(obj2.length + " "+ obj2.width+" "+ obj2.height);
//
//        WeightBox box3 = new WeightBox();
//        WeightBox box4 = new WeightBox(6,7,8,9);
//
//        System.out.println(box4.length + " "+ box4.width+" "+ box4.height+" "+box4.weight);

        //  Reference type is PARENT and object is of CHILD,
        // so
//        Box obj5 = new WeightBox(); // PARENT can create CHILD OBJECT
//        obj5.width = 2;
        // But Parent can only access parents variables

      //  WeightBox obj6 = new Box(); // NOT ALLOWED (child cannot create Parent object)

        BoxPrice obj7 = new BoxPrice();
        System.out.println(obj7.weight);
        // BoxPrice obj8 = new BoxPrice(obj7);

    }
}
