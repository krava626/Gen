package com.company;

public class Main {

    public static void main(String[] args) {
Gen<Integer,String>tgObj=new Gen<Integer, String>(88,"Generics")
        iOb=new Gen<Integer>(88);
        iOb.showType();
        int v=iOb.getOb();
        System.out.println("value: "+v);
        System.out.println();

        Gen<String> strOb=new Gen<String>("Generics Test");
        strOb.showType();

        String str=strOb.getOb();
        System.out.println("value "+str);
    }
}
