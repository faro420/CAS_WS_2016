package factory;

public class Factory {
	private Factory() {
	}

	private static Factory instance;

	public static synchronized Factory getInstance() {
		if (Factory.instance == null) {
			Factory.instance = new Factory();
		}
		return Factory.instance;
	}
}
