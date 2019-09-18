package Threading;

public class WithoutThreading 
{
	public static void main(String[] args) 
	{
		NumberG odd=new NumberG(1,100);
		NumberG even=new NumberG(2,100);
		
		odd.display();
		even.display();
		
	}

}
