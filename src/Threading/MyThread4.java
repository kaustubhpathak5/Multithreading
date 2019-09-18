package Threading;

public class MyThread4 extends Thread 
{
	Hello h;
	String msg;
	public MyThread4(Hello h,String msg)
	{
		this.h=h;
		this.msg=msg;
	}
	public void run()
	{
		h.display(msg);
		
	}
	

}
