package com.SingletonDesignPattern;

class B {
	private static B obj;

	private B() {
	}

	public static B getB() {
		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null) {
					obj = new Singleton();// instance will be created at request
											// time
				}
			}
		}
		return obj;
	}

	public void doSomething() {
		// write your code
	}
}