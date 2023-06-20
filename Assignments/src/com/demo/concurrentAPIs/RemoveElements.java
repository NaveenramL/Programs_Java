package com.demo.concurrentAPIs;

import java.util.Iterator;

public class RemoveElements implements Runnable{

	private ArrayListExample arrayList;
	 private boolean isThreadEnabled = true;
	
	public RemoveElements(ArrayListExample a) {
		this.arrayList=a;
	}
	
    public void run() {
    	Iterator itr = ArrayListExample.list.iterator();
        while (isThreadEnabled) {
            synchronized (arrayList) {
                if (!ArrayListExample.list.isEmpty()) {
                	try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                	itr.next();
                    System.out.println(ArrayListExample.list.remove(0));
                }
            }
        }
    }
}
