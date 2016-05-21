package com.company;


public class Gen<T, V> {
    T ob1;
    T ob2;
    TwoGen (T o1, V o2){
        ob1=o1;
        ob2=o2;
    }



    void showTypes(){
        System.out.println("Type of T is "+ob1.getClass().getName());
        System.out.println("Tupe of V is"+ob2.getClass().getName());
    }

     T getOb1() {
        return ob1;
    }

    T getOb2() {
        return ob2;
    }
}

