package com.company;

public class node {

    //Default Constructor
    public node(){
        data = 0;
        next = null;
    }

    //Parameterized Constructor
    public node(int val){
        data = val;
        next = null;
    }

    //Sets node's data to val
    public void setData(int val){
        data = val;
    }

    //Returns the value of the node's data
    public int getData(){
        return data;
    }

    //Sets node's next value
    public void setNext(node nextNode){
        next = nextNode;
    }

    //Returns the node's next value
    public node getNext(){
        return next;
    }

    //Private Data Members
    private int data;
    private node next;


}
