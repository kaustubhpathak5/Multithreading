//Without Lock
package Threading;

public class Test4 
{
	public static void main(String[] args) 
	{
		Hello h=new Hello();
		MyThread3 t1=new MyThread3(h,"Java");
		MyThread3 t2=new MyThread3(h,"CJC");
		
		t1.start();
		t2.start();
		
		Hello h1=new Hello();
		MyThread3 t3=new MyThread3(h1,"KNG");
		MyThread3 t4=new MyThread3(h1,"Pune");
		t3.start();
		t4.start();
		
		
		
	}

}
