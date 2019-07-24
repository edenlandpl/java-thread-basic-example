
public class WatekTest {	

	public static void main(String[] args) {
		watektest watekTest = new watektest();
		Thread watek = new Thread(this);
		watek.start(); // przeskakuje do metody run, jednak w¹tek g³ówny aplikacji idzie dalej
		for(int i=0;i<4;i++)
		{
			new MyWatek(i);
		}

	public void run() 
	{
	for(int i=0;i<10;i++)
	try{
		Thread.sleep(1000);
		}
	catch(InterruptedException e)
	}
	System.out.println("Opoznie");
}
