import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ThreadSafeSingleton {
	private static volatile ThreadSafeSingleton instance = null;

	private ThreadSafeSingleton() {
		/*
		 * Prevent Singleton pattern from creating object using Reflection API
		*/
		if(instance != null) {
			throw new RuntimeException("Don't try to be smart");
		}

		System.out.println("Object Initialized");
	}

	public static ThreadSafeSingleton getInstance() {
		/*
		 * Use double locking and synchronized for thread safely in multithreaded environment
		*/

		if(instance == null) {
			synchronized(ThreadSafeSingleton.class) {
				if(instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}

		return instance;
	}
}

public class Singleton {
	public static void main(String[] args) {

		/*
		 * Create an ExecutorService with a fixed thread pool of 2 threads
		 * and execute two tasks concurrently to demonstrate thread-safe Singleton behavior
		 * here the "Object Initialized" line printed once as only one object created
		*/
		ExecutorService executor = Executors.newFixedThreadPool(2);

		executor.execute(() -> ThreadSafeSingleton.getInstance());
		executor.execute(() -> ThreadSafeSingleton.getInstance());


		/*
		 * Test the singleton class in non-multithreaded environment
		*/
		ThreadSafeSingleton singletonObj1 = ThreadSafeSingleton.getInstance();
		
		ThreadSafeSingleton singletonObj2 = ThreadSafeSingleton.getInstance();

		System.out.println(singletonObj1 == singletonObj2);

	}
}