package com.modernjava.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorld = () -> "Hello world from com.modernjava.lambda";
        System.out.println(helloWorld.sayHelloWorld());
    }
}
