package com.interfaces;

public interface Flyable {
    void fly();
}
class Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("with wings");
    }
}
class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}
