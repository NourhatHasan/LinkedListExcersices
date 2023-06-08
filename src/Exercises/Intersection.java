package Exercises;

import com.company.LinkedList;
import com.company.Node;

public class Intersection {
    public void intersection
            (LinkedList l1,
             LinkedList l2){

        Node current1= l1.head;
        Node current2= l2.head;
        int size1= l1.size;
        int size2= l2.size;

        if(size2>size1){
            int antal=size2-size1;
            while (antal!=0){
                current1=current1.next;
                antal--;
            }
        }
        else if(size1>size2){
            int antal=size1-size2;
            while (antal!=0){
                current2=current2.next;
                antal--;
            }
        }

        while (current1!=null && current2!=null){
            if(current1.value== current2.value){

                System.out.println(current2.value);
                break;
            }
            else{
                current1=current1.next;
                current2=current2.next;
            }
        }
        if (current1 == null && current2 == null) {
            System.out.println("No intersection found");
        }
    }
}
