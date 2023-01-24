package list;
import java.util.*;

public class Prime_Number_check_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 5;
		int m = n/2;
		int flag =0;
		if(n == 0 || n== 1) {
			System.out.println(n+" is not a prime no.");
		}else {
		for(int i=2;i<=m;i++) {
			if(n%i == 0) {
				System.out.println(n+" is not a prime no.");
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println(n+" is a prime no.");
		}
		}
		
		
	}

}
