package Exercises;

import com.company.LinkedList;
import com.company.Node;

public class SumList {


    public void Sum(LinkedList l1, LinkedList l2){
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        Node current1= l1.head;
        Node current2= l2.head;

        while (current1!=null){
            sb1.append(current1.value);
            current1=current1.next;
        }

        while (current2!=null){
            sb2.append(current2.value);
            current2=current2.next;
        }


        sb1.reverse();
        sb2.reverse();

        String str1= sb1.toString();
        int intValue = Integer.parseInt(str1);
        System.out.println(intValue);


        String str2= sb2.toString();
        int intValue2 = Integer.parseInt(str2);
        System.out.println(intValue2);

        int svar= intValue+intValue2;
        String svarString= String.valueOf(svar);
        String result= new StringBuilder(svarString).reverse().toString();
        System.out.println(result);

    }


}
