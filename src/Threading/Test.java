//Threading for simultaneous methods
package Threading;

public class Test 
{
	public static void main(String[] args) 
	{
		MyThread t=new MyThread();
		t.start();
		for(int i=1;i<100;i++)
		{
			System.out.println("Main...");
		}
		
	}

}
