package com.sample;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("first", "last");

        System.out.printf("Hello " + person.getFullName());
    }
}
