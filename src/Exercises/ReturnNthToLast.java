package Exercises;

import com.company.LinkedList;
import com.company.Node;

public class ReturnNthToLast {

   public void ReturnNthToLast(LinkedList l, int n){
       Node fast= l.head;
       Node slow= l.head;
       int antal=1;
       while (fast.next!=null){
           fast=fast.next;
           antal++;
       }
       int steg= antal-n;
       for(int i=0;i<steg;i++){
           slow=slow.next;
       }

           System.out.print(slow.value+" ");


   }
}
