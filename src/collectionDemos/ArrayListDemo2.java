package collectionDemos;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");


        ArrayList alDup = new ArrayList();

        //copy elements to another list
        alDup.addAll(al);
        System.out.println(alDup); //[X, Y, Z, A, B, C]
        //remove elements to another list
        alDup.removeAll(al);
        System.out.println(alDup); //[]

        // Sort ---  Collections.sort()
        System.out.println("Elements in the array list: "+al); // [X, Y, Z, A, B, C]
        Collections.sort(al);

        System.out.println("Elements in the array list after sorting: "+al); //[A, B, C, X, Y, Z]

        Collections.reverse(al);
        System.out.println("Elements in the array list after reverse: "+al); //[Z, Y, X, C, B, A]

        Collections.shuffle(al);
        System.out.println("Elements in the array list after suffle: "+al); //[Y, A, Z, X, C, B]
    }
}
