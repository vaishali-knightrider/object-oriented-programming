package com.interfaces;

public class FlyRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for(Flyable object : flyingObjects)
            object.fly();
    }
}
