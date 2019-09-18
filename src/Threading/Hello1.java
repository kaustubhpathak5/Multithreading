package Threading;

public class Hello1 
{
	synchronized public void display(String msg)
	{
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
	}

}
