/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.opselmobile;

/**
 *
 * @author rasan
 */
public class OpselMobile {

    public static void main(String[] args) throws Exception {
        SinglyLinkedList Calllog = new SinglyLinkedList();
        MessagingStack MsgStack = new MessagingStack();

        System.out.println("Call Log:");
        Calllog.insertFromFront("713102995");
        Calllog.insertFromFront("713102996");
        Calllog.insertFromTail("713102995");
        Calllog.viewCallLog();

        System.out.println("Message Stack:");
        MsgStack.push("774334534");
        MsgStack.push("774334535");
        MsgStack.push("774334536");
        MsgStack.printMessagingStack();
        MsgStack.pop();
        MsgStack.printMessagingStack();
        
        
        MessageQueue messageQueue = new MessageQueue();
        // Forwarding messages to selected recipients
        messageQueue.enqueue("Message 1");
        messageQueue.enqueue("Message 2");
        messageQueue.enqueue("Message 3");

        // Viewing the messages in the queue
        try {
            System.out.println("Messages in the queue:");
            messageQueue.viewQueue();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Forwarding messages to recipients in FSFF manner
        try {
            while (!messageQueue.isEmpty()) {
                String message = messageQueue.dequeue();
                System.out.println("Forwarding message: " + message);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
