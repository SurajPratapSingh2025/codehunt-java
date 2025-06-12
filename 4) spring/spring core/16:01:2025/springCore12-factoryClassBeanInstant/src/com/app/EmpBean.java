package com.app;

public class EmpBean{
	
	private String companyCode;
	
	static {
		System.out.println("Bean Loading");
	}
	public EmpBean(String companyCode) {
		this.companyCode=companyCode;
		System.out.println("Bean Instantiation");
	}
	
	public void test() {
		System.out.println("Bean Custom Method "+companyCode);
	}
	
//	@SuppressWarnings("resource")
//	public static EmpBean customObject() {			//static factory method
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter Key: ");
//		
//		EmpBean empBean;
//		int key=scanner.nextInt();
//		if(key==1212) {
//			empBean=new EmpBean("QWERTY");
//		}else {
//			empBean=new EmpBean("PQRS");
//		}
//		return empBean;
//	}
	
}
