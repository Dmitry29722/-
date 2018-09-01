package main;

public class Writer implements Runnable {
	
	@Override
	public void run() {
	
		Store store=new Store();
		store.write();
		System.out.format("%s прерван\n",
                Thread.currentThread().getName());
	
	}

}
