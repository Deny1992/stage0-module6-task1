package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public static void main(String[] args) {
        System.out.println(new Bird().getDescription());
        System.out.println(new Dog().getDescription());
    }

    public String getDescription(){
        String str = numberOfPaws == 1 ? "paw" : "paws";
        String str1 = hasFur ? "a" : "no";

        return String.format("This animal is mostly %s. It has %d %s and %s fur."
                             , color, numberOfPaws, str, str1);
    }
}
