package com.sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getFirstName() {
        Person person = new Person("yamada", "tarou");

        assertEquals("yamada", person.getFirstName());
    }

    @Test
    public void getLastName() {
        Person person = new Person("yamada", "tarou");

        assertEquals("tarou", person.getLastName());
    }

    @Test
    public void getFullName() {
        Person person = new Person("yamada", "tarou");

        assertEquals("yamada tarou", person.getFullName());
    }
}