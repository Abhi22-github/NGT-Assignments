package list;


abstract class A {
     abstract void m1();
    void m2()
    {
        System.out.println("m2");
    }
}

class B extends A {
    void m1()
    {
        System.out.println("m1 in B");
    }
}
public class abstract_class_30 {
	  public static void main(String args[])
	    {
	        B b = new B();
	        b.m1();
	        b.m2();
	    }
}
