/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.opselmobile;

/**
 *
 * @author rasan
 */
public class ListNode {

    private String TpNo;
    ListNode next;

    public ListNode(String TpNo) {
        this.TpNo = TpNo;
        this.next = null;
    }

    public ListNode(String TpNo, ListNode next) {
        this.TpNo = TpNo;
        this.next = next;
    }

    public String getData() {
        return this.TpNo;
    }
    
}
