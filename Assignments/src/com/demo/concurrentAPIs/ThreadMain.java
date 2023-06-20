package com.demo.concurrentAPIs;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ArrayListExample list = new ArrayListExample();
			RemoveElements removeElements = new RemoveElements(list);
			AddElements addElements = new AddElements(list);
			Thread add = new Thread((Runnable) addElements);
			Thread remove = new Thread((Runnable) removeElements);
			
			add.start();
			remove.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
