package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class listTest {

    @Test
    public void insert() {
        list test = new list();
        test.insert(1);
        test.insert(2);
        test.insert(3);

        test.display();

        System.out.println("Test should print: 3, 2, 1");
    }
}