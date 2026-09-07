/*package CIET;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(3);
		executor.submit(()->{
			System.out.println("task 1 executes by"+ Thread.currentThread().getName());
		});
		executor.submit(()->{
		System.out.println("task 2 executes by"+ Thread.currentThread().getName());
		});
		executor.submit(()->{
			System.out.println("task 3 executes by"+ Thread.currentThread().getName());
		});
		executor.submit(()->{
			System.out.println("task 4 executes by"+ Thread.currentThread().getName());
		});
		executor.shutdown();
	}

}
*/