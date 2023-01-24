package list;

public class Value_find_array_8 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,59,7};
		int find = 59;
		int flag = 0;
		for(int a: arr) {
			if(find == a) {
				flag =1;
				break;
			}
		}
		if(flag == 1) {
			System.out.println("present");
		}else {
			System.out.println("Not Present");
		}
		
		
	}

}
