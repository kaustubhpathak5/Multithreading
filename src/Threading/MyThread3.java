package Threading;

public class MyThread3 extends Thread 
{
	Hello h;
	String msg;
	
	public MyThread3(Hello h,String msg)
	{
	this.h=h;
	this.msg=msg;
	}	
   public void run()
   {
	   h.display(msg);
	   
   }
}
