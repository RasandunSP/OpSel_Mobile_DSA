/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.opselmobile;

/**
 *
 * @author rasan
 */
public class SinglyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int noOfElements;
    
    //singlylinkedlist constructor no parameter
    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.noOfElements = 0;
    }

    //singlylinkedlist constructor with node parameter
    public SinglyLinkedList(ListNode node) {
        this.head = node;
        this.tail = node;
        this.noOfElements = 1;
    }

    //check whether the list is empty or now
    public boolean isEmpty() {
        return (this.head == null);
    }

    //see first element on the list
    public Object firstElement() throws Exception {
        if (this.head == null) {
            throw new Exception("No Telephone Numbers on the Call Log");
        } else {
            return this.head;
        }
    }

    //see last element on the list
    public Object lastElement() throws Exception {
        if (this.tail == null) {
            throw new Exception("No Telephone Numbers on the Call Log");
        } else {
            return this.tail;
        }
    }

    //add node from the tail
    public void insertFromTail(String TpNo) {
        if (this.head == null) {
            this.head = this.tail = new ListNode(TpNo);
        } else {
            this.tail = this.tail.next = new ListNode(TpNo);
        }
        this.noOfElements++;
    }

    //add node from head
    public void insertFromFront(String TpNo) {
        this.head = new ListNode(TpNo, this.head);
        if (this.tail == null) {
            this.tail = this.head;
        }
        this.noOfElements++;
    }

    //remove node from tail
    @SuppressWarnings("empty-statement")
    public String deleteFromTail() throws Exception {
        String TpNo;

        if (this.isEmpty()) {
            //No Elements to Delete
            throw new Exception("No Telephone Numbers on the Call Log");
        } else if (this.head == this.tail) {
            //Only one element in the list
            TpNo = this.head.getData();
            this.head = this.tail = null;
            this.noOfElements--;
        } else {
            //More than one element in the list
            ListNode temp;
            TpNo = this.tail.getData();

            for (temp = this.head; temp.next != this.tail; temp = temp.next);
            this.tail = temp;
            this.tail.next = null;
            this.noOfElements--;
        }
        return TpNo;
    }

    //remove node from head
    public String deleteFromFront() throws Exception {
        String TpNo;

        if (this.isEmpty()) {
            //No elements to delete
            throw new Exception("No Telephone Numbers on the Call Log");
        } else if (this.head == this.tail) {
            //Only one element to delete
            TpNo = this.head.getData();
            this.head = this.tail = null;
            this.noOfElements--;
        } else {
            //More than one element in the list
            TpNo = this.head.getData();
            this.head = this.head.next;
            this.noOfElements--;
        }
        return TpNo;
    }

    //print the list
    public void viewCallLog() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("No Telephone Numbers on the Call Log");
        } else {
            for (ListNode temp = this.head; temp != null; temp = temp.next) {
                System.out.print(temp.getData() + "\t");
            }
            System.out.println();
        }
    }
}
