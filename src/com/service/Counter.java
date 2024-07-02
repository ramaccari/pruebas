package com.service;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter extends Thread {

	// Variable Atómica
	public AtomicInteger count;

	public Counter() {
		super();
		this.count = new AtomicInteger();
	}

	@Override
	public void run() {
		int max = 100_000_000;
		
		// Incrementando el contador un máximo de veces
		for (int i = 0; i < max; i++) {
			count.addAndGet(1);
		}
	}
	
}
