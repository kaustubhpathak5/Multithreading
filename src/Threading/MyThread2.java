package Threading;

public class MyThread2 implements Runnable
{
	public void main()
	{
		for(int i=1;i<100;i++)
		{
			System.out.println(i+" "+Thread.currentThread().getName());
			
		}
	}

	private Object Current() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
