package com.javaIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable{
	private int id;
	private String name;
	private String address;
	private float salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Demo(int id,String name,String address,float salary) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
}
public class SerializationDeserialization {
	public static void main(String[] args) throws Exception{
		Demo demo=new Demo(11,"raju","mi",1000);
		FileOutputStream fos = new FileOutputStream("pqrs.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(demo);
		System.out.println("Demo");
		
		//Deserialization
//		FileInputStream fis = new FileInputStream("pqrs.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		
//		Demo d=(Demo) ois.readObject();
//		System.out.println(d.toString());
//		
//		ois.close();
//		fis.close();
	}
}
