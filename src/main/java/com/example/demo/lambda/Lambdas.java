package com.example.demo.lambda;

public class Lambdas {

    public static void main(String[] args) {
        Speakable dog = () -> System.out.println("another dog barks");
        speak(dog);
    }

    public static void speak(Speakable speakable) {
        speakable.speak();
    }
}
