package org.tnsif.ThreadDemo;

public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram s=new SimpleThreadProgram();
		//Used to change the thread name
		s.setName("Java Thread");
		//Used to change the priority
		s.setPriority(8);
		//When thread calls to start method,it will come to run method
		//s.start();
		//Once we call the start method,again we can't restart..
		s.start();
		//s.start();
		System.out.println("Current Thread"+s);

	}

}
