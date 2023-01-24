package list;

 class AClass {
	public void mA()
	{
		System.out.println("in A");
	}
}

 class BClass extends AClass {
	 BClass(){
		 
	 }
	public void mB()
	{
		System.out.println("in B");
	}
}
public class inheritance_26 {

	public static void main(String[] args) {
		BClass obj = new BClass();
		obj.mB();
		obj.mA();

	}

}
