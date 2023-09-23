// Write a program to create a linked list

import java.lang.*;
import java.util.*;

class noNodeException extends Exception{
    @Override
    public String toString(){
        return "Empty list";
    }
}
class node
{
    public int data;
    public node next;

    node(){
        this.data = 0;
        this.next = null;
    }
    node(int item){
        this.data = item;
        this.next = null;
    }
}

class LinkedList
{
    private node head;
    private node tail;
    private int count;
    public LinkedList(){
        this.head = null;
        this.count = 0;
    }

    public node getHead() throws noNodeException{

        if(this.head == null){
            throw new noNodeException();
        }
        return this.head;
    }

    public int getCount(){
        return this.count;
    }

    public void push(int item)
    {
        node n = new node(item);
        count++;
        if(head == null){
            head = n;
            tail = n;
        }else{
            tail.next = n;
            tail = tail.next;
        }
    }

    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data+"---->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    public void display(node n){
        while(n != null){
            System.out.print(n.data+"---->");
            n = n.next;
        }
        System.out.print("NULL");
    }

    public void reDisplay(node head){
        if(head == null){
            System.out.print("NULL");
        }else{
            System.out.print(head.data+"---->");
            reDisplay(head.next);
        }
    }

    public void insertAtBeginning(int data)
    {
        node n = new node(data);
        n.next = head;
        head = n;
        this.count++;
    }
}

public class createLinkedList
{
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        try{
            l.getHead();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
