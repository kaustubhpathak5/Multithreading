//Runnable interface
package Threading;

public class Test2 
{
	public static void main(String[] args) 
	{
		MyThread mt=new MyThread();
		mt.start();
		
		for(int i=1;i<100;i++)
		{
		System.out.println("main...");	
		}
		
	}

}
