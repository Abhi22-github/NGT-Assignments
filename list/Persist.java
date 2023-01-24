package list;

import java.io.*;    
class Persist{    
 public static void main(String args[]){    
  try{    
  //Creating the object    
  Student s1 =new Student(211,"ravi");    
  //Creating stream and writing the object    
  FileOutputStream fout=new FileOutputStream("f.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);    
  out.writeObject(s1);    
  out.flush();    
  //closing the stream    
  out.close();    
  System.out.println("success");    
  }catch(Exception e){System.out.println(e);}    
 }    
}
class Student implements Serializable{
	int a;
	String s;
	Student(int a,String s){
		this.a = a;
		this.s = s;
	}
}