package list;

public class Alphabet_check_15 {
	public static void main(String[] args) {

        char c = '#';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}
