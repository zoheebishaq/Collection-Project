package collectionDemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        // Declare Linked list
        LinkedList l = new LinkedList();

//        LinkedList<Integer> lInt = new LinkedList<Integer>();

        //add elements into linked list
        l.add(100);
        l.add("welcome");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l); //[100, welcome, 15.5, A, true, null]
        System.out.println(l.size()); // 6

        l.remove(1);
        System.out.println("after removing, new list :"+l); //[100, 15.5, A, true, null]

        //insert /adding element in tthe middle of linked list
        l.add(3,"BIBO");
        System.out.println("after inserting new element "+l); //[100, 15.5, A, BIBO, true, null]

        //retriving value/objet
        System.out.println(l.get(3)); //BIBO

        //change the value
        l.set(5,"X");
        System.out.println("After we change the value "+l);

        //contains()
        System.out.println(l.contains("BIBO")); // true
        System.out.println(l.contains("BOBI")); // false
        //is empty()
        System.out.println(l.isEmpty());// fase

        //Reading elements from LL using for loop

        System.out.println("Reading element using foreach loop");

        System.out.println("Reading element using for loop");
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        for (Object e:l
        ) {
            System.out.println(e);
        }

        System.out.println("Reading element using iterator method");
        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
