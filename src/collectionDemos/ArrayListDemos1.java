package collectionDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemos1 {
    public static void main(String[] args) {
        //Declare Arraylist
        ArrayList al = new ArrayList();

        //different ArrayList

//        ArrayList<Integer> alI = new ArrayList<Integer>();
//
//        ArrayList<String> alS = new ArrayList<String>();
//
//        List alList = new ArrayList();

        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al); // [100, welcome, 15.5, A, true]

        //size()
        System.out.println("Number of elements in ArrayList "+ al.size()); // Number of elements in ArrayList 5

        //remove
        al.remove(1);
      //  al.remove("welcome");
        System.out.println("after removing element from array list:" + al); //after removing element from array list:[100, 15.5, A, true]

        //insert new element

        al.add(2,"bibi");
        System.out.println("after adding new element to array list:" + al); //after adding new element to array list:[100, 15.5, bibi, A, true]

        //retieve specific element
        System.out.println(al.get(2)); //bibi

        // change element/replace
        al.set(2,"chici");

        System.out.println("after replacing element" +al);//after replacing element[100, 15.5, chici, A, true]

        //search -contains()
        System.out.println(al.contains("chichi")); //false
        System.out.println(al.contains("chici"));   // true

        //isEmpty
        System.out.println(al.isEmpty()); // false

        //1 for loop
        System.out.println("Reading element using for loop");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        //2 for each loop
        System.out.println("Reading element using foreach loop");
        for (Object e:al
             ) {
            System.out.println(e);
        }
        //3 iterator()
        System.out.println("Reading element using iterator method");
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }


}
