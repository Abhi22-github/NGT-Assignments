package list;

class AC {
	public void m()
	{
		System.out.println("in A");
	}
}

class BC extends AC {
	
	public void m()
	{
		super.m();
		System.out.println("in B");
	}
}
public class super_30 {

	public static void main(String[] args) {
		BC obj = new BC();
		obj.m();
		

	}

}