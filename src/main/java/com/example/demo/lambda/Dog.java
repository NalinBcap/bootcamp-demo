package com.example.demo.lambda;

public class Dog implements Speakable {
    @Override
    public void speak() {
        System.out.println("bark");
    }
}
