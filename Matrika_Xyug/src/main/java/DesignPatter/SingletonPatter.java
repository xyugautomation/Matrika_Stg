package DesignPatter;

public class SingletonPatter {

	private static SingletonPatter instance = null;

	private SingletonPatter() {

	}

	public static synchronized SingletonPatter getInstance() {

		if (instance == null) {
			instance = new SingletonPatter();
		}

		return instance;
	}

}

