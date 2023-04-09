package org.edu.vikson.dp.singleton;

//Java Code to create singleton class
//With Lazy initialization
public class Test1 {
// private instance, so that it can be
// accessed by only by getInstance() method
	private static Test1 instance=null;

	private Test1() {
		// private constructor
	}

//method to return instance of class
	public static Test1 getInstance() {
		if (instance == null) {
			// if instance is null, initialize
			instance = new Test1();
		}
		return instance;
	}
}
