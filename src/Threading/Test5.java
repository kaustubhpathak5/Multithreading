package Threading;

public class Test5 
{
	public static void main(String[] args) 
	{
		Hello h=new Hello();
		MyThread4 t1=new MyThread4(h,"Java");
		MyThread4 t2=new MyThread4(h,"Cjc");
		 t1.start();
		 t2.start();
		 Hello h1=new Hello();
		 MyThread4 t3=new MyThread4(h,"KNG");
		 MyThread4 t4=new MyThread4(h,"Pune");
		 t3.start();
		 t4.start();
		 
		 
		 
		 
		
	}

}
