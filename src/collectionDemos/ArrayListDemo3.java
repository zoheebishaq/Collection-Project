package collectionDemos;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo3 {
    public static void main(String[] args) {


        String arr[] = {"Dog", "Cat", "Elephant"};

        for (String value :arr){
            System.out.println(value);
        }
        //convert array to arraylist
        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
