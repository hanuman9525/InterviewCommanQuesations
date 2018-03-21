package com.scp.concurency;

public class MyRunnable implements Runnable {

	public void run() {
		int sum=0;
		for(int i=0;i<10;i++)
			sum+=i;
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sum);
	}

}
