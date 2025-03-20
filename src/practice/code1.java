package march6;

public class code1 extends Thread{
	static int sum=0;
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			sum = sum+i;
		}
		
	}
}
