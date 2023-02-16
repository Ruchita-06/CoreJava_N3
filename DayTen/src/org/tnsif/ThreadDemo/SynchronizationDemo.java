package org.tnsif.ThreadDemo;

public class SynchronizationDemo {
	synchronized void print(int num) throws InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
		}
	}
}
//Thread One
class ThreadOne extends Thread
{
	SynchronizationDemo d;

	public ThreadOne(SynchronizationDemo d) {
		super();
		this.d = d;
	}
	public void run(){
		try {
			d.print(10);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
}
}
//Thread Two
class ThreadTwo extends Thread
	{
		SynchronizationDemo d1;

		
		public ThreadTwo(SynchronizationDemo d1) {
			super();
			this.d1 = d1;
		}

		public void run(){
			try {
				d1.print(12);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
		
	}
	

