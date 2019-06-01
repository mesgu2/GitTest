package com.company;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class nodeTest {

    @BeforeClass
    public static void beforeSetData() {
        System.out.println("Set Data Test");
    }

    @Test
    public void setData() throws Exception {
        node test = new node();
        test.setData(1);
        test.display();
        assertEquals(1, test.getData());
    }

    @AfterClass
    public static void afterSetData() {
        System.out.println("Node's data should be 1");
    }

    @BeforeClass
    public static void beforeGetData() {
        System.out.println("Get Data Test");
    }

    @Test
    public void getData() {
        node test = new node(10);
        assertEquals(10, test.getData());
    }

    @AfterClass
    public static void afterGetData() {
        System.out.println("Node's data should be 10");
    }

    @BeforeClass
    public static void beforeSetNext() {
        System.out.println("Set Next Test");
    }

    @Test
    public void setNext() {
        node test = new node();
        test.setNext(null);
        assertNull(test.getNext());
    }

    @AfterClass
    public static void afterSetNext() {
        System.out.println("Next should be null");
    }

    @BeforeClass
    public static void beforeGetNext() {
        System.out.println("getNext Test: ");
    }

    @Test
    public void getNext() {
        node test = new node();
        assertNull(test.getNext());
    }

    @AfterClass
    public static void afterGetNext() {
        System.out.println("Next should be null");
    }

    /*
    @Test
    public void display() {
        node test = new node();
        assertEquals("Data: 0\n", test.display(
    }
    */
}