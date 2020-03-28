package com.arafath.javacourse.lesson2;
import com.arafath.lesson3.debriefing.Name;

public class Person {

    public Person() {
        // empty the contructor on purpose - default constructor
    }

    private Name personName;

    public String helloWorld(){
        return "Hello world";
    }

    public Name setPersonName() {
        return personName;
    }

    public String hello(String arafath) {
        return "Hello " + arafath;
    }
}
