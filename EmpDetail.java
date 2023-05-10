package week1;
public class EmpDetail {
	
	public void getEmpName(String name)
	{
		System.out.println("Name:"+name);
	}
	public void getEmpId(int a) 
	{
		System.out.println("EmpID:"+a);
	}
	public void empAddress(String address) {
		System.out.println("Address:"+address);
	}
	public void empSalary(double a) {
		System.out.println("Salary:"+a);
	}
	public void empPhnNumber(long a) {
		System.out.println("MobileNumber:"+a);
	}
	public static void main(String[] args) {
		EmpDetail details=new EmpDetail();
		details.getEmpName("GS Sathish");
		details.getEmpId(266200);
		details.empAddress("kumbakonam");
		details.empSalary(75000);
		details.empPhnNumber(9876543234l);	
	} 
	}
