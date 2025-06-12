package javaArray;

class Dept1{
	public int[] dis(){
//		int arr[]= {2,4,5,6};
//		int arr[]=new int[] {2,4,5,6};
		
		return new int[] {2,4,5,6};
		
	}
}

public class AnonymousArray {
	public static void main(String[] args) {
		Dept1 dept=new Dept1();
		int []res=dept.dis();
		for(int k:res) System.out.print(k+" ");
	}
}
