//Set the name
package Threading;

public class Test3 
{
	public static void main(String[] args) 
	{
		MyThread2 mt=new MyThread2();
		Thread mtt=new Thread(mt);
		
		mtt.setName("kaustubh");
		mtt.start();
		for(int i=1;i<100;i++)
		{
			System.out.println("Java");
			
		}
		
		
		
	}

}
