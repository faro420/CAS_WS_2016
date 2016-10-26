package interfaces;

import factory.FactoryImpl;

public interface Factory {
	public static Factory create() {
		return FactoryImpl.getInstance();
	}
}
