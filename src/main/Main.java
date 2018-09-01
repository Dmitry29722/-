package main;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
	private static Writer writer;
	private static Reader reader;
	private static Thread threadW;
	private static Thread threadR;
	
	public static StringBuffer book = new StringBuffer("p");

	public static void main(String[] args) throws InterruptedException {
		 for (int i = 0; i <2; i++) {
			writer =new Writer();
			reader=new Reader();
		 	threadR=new Thread(reader);
		 	threadR.setName("Читатель");
			threadW=new Thread(writer);
			threadW.setName("Писатель");
			threadW.start();
			threadW.join();
			threadR.start();
			

		 }
	}

}
