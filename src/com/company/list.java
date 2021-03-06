package com.company;

/*Author: Montana Esguerra
  Date: 5/30/2019
  Filename: list.java
  Description:
  This list class is an implementation of a linearly linked list
  Items inserted into this list are added at the head of the list.
 */
public class list {

    //Default Constructor
    public list(){
        head = null;
    }

    /*Insert: This method inserts
    new items at the head of the list
     */
    public void insert(int toAdd){

        if(head == null){
           head = new node(toAdd);
           return;
        }

        node newNode = new node(toAdd);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    //Displays the contents of the list starting from the head
    public void display(){
        node current = head;

        while(current != null){
            current.display();
            current = current.getNext();
        }
    }

    //Returns the total sum of all the elements in the list
    public int sum() {
        return sum(this.head);
    }

    //Recursively traverses the list and displays nodes with each traversal
    private void display(node head){
        if(head == null) return;

        this.head.display();

        display(this.head.getNext());
    }

    //Recursively traverses the list, adding elements with each traversal
    private int sum(node head) {
        if(head == null) return 0;

        int sum = 0;
        sum += head.getData() + sum(head.getNext());

        return sum;
    }

    //Head of the linearly linked list
    private node head;
}
