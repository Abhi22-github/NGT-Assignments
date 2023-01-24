package list;

import java.util.ArrayList;
import java.util.List;

public class join_list_10 {
public static void main(String[] args) {
	List<Integer> l1 = new ArrayList<Integer>();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	
	List<Integer> l2 = new ArrayList<Integer>();
	l1.add(4);
	l1.add(5);
	l1.add(6);
	
	List<Integer> l = new ArrayList<Integer>();
	l.addAll(l1);
	l.addAll(l2);
	
	System.out.println(l);
}
}
