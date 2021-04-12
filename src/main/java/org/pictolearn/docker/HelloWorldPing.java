package org.pictolearn.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 100; i++){
			System.out.println("Hi World Ping  2 " + i );
			Thread.sleep(1000);
		}
	}
}
