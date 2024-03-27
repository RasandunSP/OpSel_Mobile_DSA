/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.opselmobile;

/**
 *
 * @author rasan
 */
public class MessagingStack {
    //instance from class - singlylinkedlist
    private final SinglyLinkedList list;

    //new stack
    public MessagingStack() {
        this.list = new SinglyLinkedList();
    }
    
    //add element from head
    public void push(String TpNo) {
        this.list.insertFromFront(TpNo);
    }

    //remove element from head
    public String pop() throws Exception {
        return this.list.deleteFromFront();
    }

    //display first element
    public int firstmssg() throws Exception {
        return (int) this.list.firstElement();
    }

    //view stack
    public void printMessagingStack() throws Exception {
        this.list.viewCallLog();
    }

}
