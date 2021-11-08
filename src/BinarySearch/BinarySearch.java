package BinarySearch;


import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList <String> s1 = new ArrayList<String>();
        s1.add("яблоко");
        s1.add("груша");
        s1.add("банан");
        s1.add("морковь");
        s1.add("виноград");
        s1.add("манго");
        s1.add("гранат");

        System.out.println(s1);

        int index = Collections.binarySearch(s1, "морковь");
        System.out.println(index);
    }

}
