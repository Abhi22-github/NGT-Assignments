package list;

interface printable{  
	void print();  
}  
class interface_25 implements printable{  
	public void print(){
		System.out.println("Hello");
		}  

	public static void main(String args[]){  
		interface_25 obj = new interface_25();  
		obj.print();  
	}  
}  
