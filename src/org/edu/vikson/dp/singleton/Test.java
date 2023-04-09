package org.edu.vikson.dp.singleton;

public class Test {
	
	//create variable private ,static ,final and return type same as class name
	private static final Test instance=new Test();

	private Test() {

	}
	
	public static Test getInstance(){
        return instance;
    }
	
}




