package Threading;

public class WithThreading 
{
	public static void main(String[] args) 
	{
		Number odd=new Number(1,100);
		Number even=new Number(2,100);
		
		odd.start();
		even.start();
		
		
		
		
		
	}

}
