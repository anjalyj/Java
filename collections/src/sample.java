/**
 * Created by anjalyj on 29/02/16.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.*;

public class sample {

    public static void main(String[] args) {
        //ArrayList
        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        ArrayList<String> li = new ArrayList<String>(
        Arrays.asList("Pratap", "Peter", "Harsh"));
        li.remove("Pratap");
        System.out.println("Elements are:"+li);
        System.out.println();
        Iterator it = a1.iterator();

        System.out.println("ArrayList Elements");
        while(it.hasNext()) {
            String obj = (String)it.next();
            System.out.println(obj);
        }

        ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
        System.out.println("ArrayList items: "+intlist);
//
//        //LinkedList
//        List l1 = new LinkedList();
//        l1.add("Zara");
//        l1.add("Mahnaz");
//        l1.add("Ayan");
//        Iterator it1 = a1.iterator();
//        System.out.println(" LinkedList Elements");
//        while(it1.hasNext()) {
//            String obj = (String) it1.next();
//            System.out.println(obj);
//        }
//        //HashSet
//        Set s1 = new HashSet();
//        s1.add("Zara");
//        s1.add("Mahnaz");
//        s1.add("Ayan");
//        System.out.println(" Set Elements");
//        Iterator it2 = a1.iterator();
//        while(it2.hasNext()) {
//            String obj = (String) it2.next();
//            System.out.println(obj);
//        }

    }
}
