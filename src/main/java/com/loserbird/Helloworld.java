package com.loserbird;

public class Helloworld {

    public String say(){
        return "helloworld";
    }

    public void sayHello(){
        System.out.println("helloworld");
    }

    public  static void main(String[] args){
        System.out.println(new Helloworld().say());

    }
}
