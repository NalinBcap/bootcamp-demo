package com.example.demo.lambda;

public class Cat implements Speakable {
    @Override
    public void speak() {
        System.out.println("meow");
    }
}
