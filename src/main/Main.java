package main;


public class Main {
	private static Writer writer;
	private static Reader reader;
	private static Thread threadW;
	private static Thread threadR;
	
	public static StringBuffer book = new StringBuffer("p");

	public static void main(String[] args) throws InterruptedException {
		 for (int i = 0; i <5; i++) {
			writer =new Writer();
			reader=new Reader();
		 	threadR=new Thread(reader);
		 	threadR.setName("Читатель"+i);
			threadW=new Thread(writer);
			threadW.setName("Писатель"+i);
			threadW.start();
			threadR.start();
		
		 }
	}

}
