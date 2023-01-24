package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List__array_11 {
public static void main(String[] args) {

    String[] array = {"apple", "mango", "banana"};
    System.out.print("Array: ");
    for(String item:array) {
        System.out.print(item+", ");
      }
    System.out.println();
    // convert array to list
    List fruits= new ArrayList<>(Arrays.asList(array));

    System.out.println("List: " + fruits);
    
    System.out.println("--------------------------------------");
    
    System.out.println("List: " + fruits);
    String[] arr = new String[fruits.size()];

    // Convert ArrayList into the string array
    fruits.toArray(arr);
    System.out.print("Array: ");
    for(String item:arr) {
      System.out.print(item+", ");
    }
}
}
