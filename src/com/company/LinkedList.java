package com.company;

import java.util.HashSet;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void creat(int value){
        Node node= new Node();
        node.value=value;
        node.next=null;
        head=tail=node;
        size++;
    }
    public void insert(int value){
        Node node= new Node();
        node.value=value;
        Node temp=tail;
        tail=node;
        temp.next=node;
        node.next=null;
        node.prev=temp;
        size++;
    }

    public void traverce(){
        Node temp=head;
        for (int i=0; i<size;i++){
            System.out.print(temp.value);

            if(i<size-1){
                System.out.print("-> ");
            }
            temp=temp.next;
        }
        System.out.println();
    }



}





