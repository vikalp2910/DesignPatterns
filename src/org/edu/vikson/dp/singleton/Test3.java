package org.edu.vikson.dp.singleton;


public class Test3 {

	private Test3() {
		// private constructor
	}

// Inner class to provide instance of class
	private static class InnerSingleton {
		private static final Test3 INSTANCE = new Test3();
	}

	public static Test3 getInstance() {
		return InnerSingleton.INSTANCE;
	}
}
