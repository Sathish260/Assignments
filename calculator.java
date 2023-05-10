package week1;

public class calculator {
	public void addTwoNumbers(int a , int b) 
	{
		int c=a+b;
		System.out.println(c);
	}
	public void subtractTwoNumber(int e , int f) 
	{
		int d=e-f;
		System.out.println(d);
	}
	public void multiplyTwoNumber(double i , double j)
	{
		double g= i*j;
		System.out.println(g);
	}
	public void divideTwoNumber(float x , float y)
	{
		float s= x/y;
		System.out.println(s);
	}
	public static void main(String[] args) {
		calculator calc=new calculator();
		calc.addTwoNumbers(1000,1000);
		calc.subtractTwoNumber(100, 200);
		calc.multiplyTwoNumber(20,10);
		calc.divideTwoNumber(100, 10);
	}

}
