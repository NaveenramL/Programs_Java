package com.demo.concurrentAPIs;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        try {
            Data data = new Data();
            Consumer consumerRunnable = new Consumer(data);
            Thread producer = new Thread(new Producer(data));
            Thread consumer = new Thread(consumerRunnable);

            producer.start();
            consumer.start();
            producer.join();

            try {
                //wait for consumer to consume data and then stop the thread
                Thread.sleep(1000);
                consumerRunnable.stopConsumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	}


