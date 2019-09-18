package Threading;

public class Number extends Thread 
{
	int st;
	int end;
	
	public Number(int st,int end)
	{
		this.st=st;
		this.end=end;
	}
	public void run()
	{
		for(int i=st;i<end;i++)
		{
			System.out.println(i);
			i++;
			
		}
	}
	}


