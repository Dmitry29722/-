package main;

public class Writer implements Runnable {
	
	@Override
	public void run() {
	
		Monitor store=new Monitor();
		store.write();
		System.out.format("%s прерван\n",
                Thread.currentThread().getName());
	
	}

}
