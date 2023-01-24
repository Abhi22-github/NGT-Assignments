package list;

public class fibonnaci_series_2 {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,size=50;

		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=2;i<size;i++) {
			n3 = n1+n2;
			System.out.println(n3);
			n1= n2;
			n2 = n3;
		}
	}

}
