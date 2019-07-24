
public class MyWatek extends Thread{
	
	private int id;
	
	public Mywatek (int id)
	{
		this.id=id;
		start();
	}
public void run()
{
	for(int i=0;i<10;i++)
		try{
			Thread.sleep(1000);
			}
		catch(InterruptedException e);
	}
	System.out.println("Opoznienie " + " Kumunikat drugi");
}
}
