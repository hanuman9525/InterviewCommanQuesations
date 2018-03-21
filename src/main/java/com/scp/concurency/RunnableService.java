package com.scp.concurency;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class RunnableService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// By using directly thread
		Thread t = new Thread(new MyRunnable());
		t.start();
		// By using Executar
		Executor service = Executors.newFixedThreadPool(5);
		service.execute(new MyRunnable());
		// By using ExecutarService with lambda expressions
		ExecutorService service2 = Executors.newFixedThreadPool(5);
		service2.execute(() -> {
			int sum = 0;
			for (int i = 0; i < 10; i++)
				sum += i;
			System.out.println(sum);
		});
		service2.shutdown();
		
		ExecutorService service3 = Executors.newFixedThreadPool(5);
		Future<String> task = service3.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "asc";
			}
		});
		System.out.println(task.get().toString());
System.out.println("ThreadPool");
		ThreadPoolExecutor executarService = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			executarService.execute(new MyRunnable());
		}
		System.out.println("sutdown");
		executarService.shutdown();
	}

}
