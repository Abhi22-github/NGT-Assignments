package list;

public class Average_array_4 {
	public static void main(String[] args) {
			int[] arr = {1,2,5,7,8};
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum += arr[i];
			}
			System.out.println("Average is "+ (((float)sum/(float)arr.length)));
			
	}
}
