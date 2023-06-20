package com.demo.concurrentAPIs;

public class Producer implements Runnable{

	  private final Data data;

	    public Producer(Data data) {
	        this.data = data;
	    }

	    
	    public void run() {
	        for (int i = 0; i < 100; i++) {
	            synchronized (data) {
	                data.a.add(i);
	            }
	        }
	    }
}
