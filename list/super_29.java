package list;

class ACl {
	public void m()
	{
		System.out.println("in A");
	}
}

class BCl extends ACl {
	
	public void m()
	{
		System.out.println("in B");
	}
}
public class super_29 {

	public static void main(String[] args) {
		BCl obj = new BCl();
		obj.m();
		

	}

}