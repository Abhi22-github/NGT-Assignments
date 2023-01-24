package list;

class AClass1 {
	public void mA()
	{
		System.out.println("in A");
	}
}

class BClass1 extends AClass1 {
	 BClass1(){
		 
	 }
	public void mB()
	{
		System.out.println("in B");
	}
}
public class inheritance_27 {

	public static void main(String[] args) {
		AClass1 obj = new BClass1();
		obj.mA();
		((BClass1) obj).mB();

	}

}