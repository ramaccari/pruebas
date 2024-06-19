package com.observables;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.functions.Action1;

public class TestObservable {

	public static void main(String[] args) {
		
		// Emite 20 números secuenciales cada 500 milisegundos
		Observable<Long> o1 = Observable.interval(500, TimeUnit.MILLISECONDS).take(20);

		// Emite 20 número secuenciales cada 200 milisegundos
		Observable<Long> o2 = Observable.interval(200, TimeUnit.MILLISECONDS).take(20);
		
		// Se define juntan los observables y se ejecuta una única acción
		Observable.merge(o1, o2).subscribe(new Action1<Long>() {

			@Override
			public void call(Long num) {
				System.out.println(num);
			}
		});
		
		// Para darle tiempo de ejecución
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
