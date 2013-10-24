package creational.singleton;

public class Singleton {

	private static Singleton mInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (mInstance != null) {
			mInstance = new Singleton();
		}

		return mInstance;
	}
}