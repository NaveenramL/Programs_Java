package com.demo.concurrentAPIs;

public class AddElements implements Runnable{

	private ArrayListExample arrayList;
	
	public AddElements(ArrayListExample a) {
		this.arrayList=a;
	}
	
	public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (arrayList) {
            	ArrayListExample.list.add(i);
            	try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }
    }
}
