/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.opselmobile;

/**
 *
 * @author rasan
 */
public class MessageQueue {

    private ListNode front;
    private ListNode rear;
    private int size;

    public MessageQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return (this.front == null);
    }

    public void enqueue(String message) {
        ListNode newNode = new ListNode(message);
        if (isEmpty()) {
            this.front = newNode;
        } else {
            this.rear.next = newNode;
        }
        this.rear = newNode;
        this.size++;
    }

    public String dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        String message = this.front.getData();
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        this.size--;
        return message;
    }

    public void viewQueue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        } else {
            for (ListNode temp = this.front; temp != null; temp = temp.next) {
                System.out.print(temp.getData() + "\t");
            }
            System.out.println();
        }
    }
}

