package test;

import creational.singleton.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton instanceA = Singleton.getInstance();
		Singleton instanceB = Singleton.getInstance();

		System.out.println(instanceA == instanceB);
	}

}
