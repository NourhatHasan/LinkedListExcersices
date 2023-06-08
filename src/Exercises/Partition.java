package Exercises;

import com.company.LinkedList;
import com.company.Node;

import java.util.Arrays;
import java.util.HashSet;

public class Partition {
    LinkedList Partition(int x, LinkedList l){
      Node current= l.head;
      l.head=l.tail;

      while (current!=null){
          Node next=current.next;

          if(current.value<x){
              current.next=l.head;
              l.head=current;
          }
          else{
              l.tail.next=current;
              l.tail=current;
          }
          current=current.next;
      }
      l.tail.next=null;
      return l;
    }


}
