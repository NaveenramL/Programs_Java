package com.demo.concurrentAPIs;

public class Consumer implements Runnable{

	  private Data data;
	    private boolean isThreadEnabled = true;

	    public Consumer(Data data) {
	        this.data = data;
	    }

	    @Override
	    public void run() {
	        while (isThreadEnabled) {
	            synchronized (data) {
	                if (!data.a.isEmpty()) {
	                    System.out.println(data.a.remove(0));
	                }
	            }
	        }
	    }

	    public void stopConsumer() {
	        isThreadEnabled = false;
	    }
}
