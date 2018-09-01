package main;

public class Reader implements Runnable{
	

	@Override
	public void run() {
		Store store=new Store();
		System.out.println(store.read());
		System.out.format("%s прерван\n",
                Thread.currentThread().getName());
		
	}
}
