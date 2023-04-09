package org.edu.vikson.dp.singleton;

//Java code to explain double check locking
public class Test2 {
// private instance, so that it can be
// accessed by only by getInstance() method
	private static Test2 instance;

	private Test2() {
		// private constructor
	}

	public static Test2 getInstance() {
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (Test2.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new Test2();
				}

			}
		}
		return instance;
	}
}
