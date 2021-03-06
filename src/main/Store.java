package main;

import java.util.concurrent.locks.*;

class Monitor {

	private final static ReadWriteLock rwlock = new ReentrantReadWriteLock();
	
	public   void write() {
		rwlock.writeLock().lock();
		try {
			for (int i = 0; i < RandomGenerate.getRandomQuantityLetters(); i++) {
				Main.book.append("/" + i);	
			}
			Main.book.append("Zzz\n");
			Thread.sleep(RandomGenerate.getRandomTime());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
			rwlock.writeLock().unlock();
			}
		}

	public synchronized String read() {
		rwlock.readLock().lock();
		try {
			return Main.book.toString();
		} finally {
			rwlock.readLock().unlock();
		}
	}
}