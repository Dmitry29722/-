package main;

public class Reader implements Runnable{
	

	@Override
	public void run() {
		Monitor store=new Monitor();
		System.out.println(store.read());
		System.out.format("%s �������\n",
                Thread.currentThread().getName());
		
	}
}
