class A implements Runnable
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("\t ThreadX" +i);
		}
		System.out.println("End of ThreadX");
	}
}
class Exp_12b
{
	public static void main(String args[])
	{
		A obj = new A();
		Thread t = new Thread(obj);
		t.start();
		
		//new Thread(new X().start());
		System.out.println("End of Main Thread");
	}
}
