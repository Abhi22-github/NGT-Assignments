package list;


interface printable1{  
	void print();  
}  

interface clickable{  
	void click();  
} 

interface resizable{  
	void resize();  
} 




class interface_28 implements printable1,clickable,resizable{  
	public void print(){
		System.out.println("Hello");
		}  
	@Override
	public void resize() {
		System.out.println("resize");
		
	}

	@Override
	public void click() {
		System.out.println("click");
		
	}  
	public static void main(String args[]){  
		interface_28 obj = new interface_28();  
		obj.print();
		obj.resize();
		obj.click();
	}

	
}  



