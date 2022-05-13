package progs;

public class B extends A
{
	int b=20;
	int a=10;
	public void messageb()
	{	System.out.println("super"+super.a);
		System.out.println(a);
		System.out.println("from message b");
	}
public static void main(String[] args) 
{
		B a = new B();
		a.messageb();
		
}

}
