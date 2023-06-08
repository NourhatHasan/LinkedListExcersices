package Exercises;

import com.company.LinkedList;
import com.company.Node;

import java.util.HashSet;

public class RemoveDoplicateNode {

    public void RemocveDoplicate(LinkedList l){
        HashSet<Integer> set= new HashSet<>();
        Node Current= l.head;
        set.add(Current.value);

        while(Current!=null){
            if(Current.next!=null ) {

                if (set.contains(Current.next.value)) {
                    Current.next = Current.next.next;
                    l.size--;
                } else {
                    set.add(Current.next.value);

                }

            }
            else{
                if(set.contains(Current.value)){
                    Current.next=null;
                    l.size--;
                }
            }

            Current=Current.next;
        }
    }
}
