package list;

public class Palindrome_check_3 {
public static void main(String[] args) {
	String s = "nayan";
	
	StringBuilder s1 = new StringBuilder(s);

    String rev =s1.toString();
    
    if(s.equals(rev)) {
    	System.out.println("Palindrom");
    }else {
    	System.out.println("Not Palindrome");
    }
}
}
