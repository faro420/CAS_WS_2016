package factory;

import interfaces.Factory;

public class FactoryImpl implements Factory {
	
	private static FactoryImpl instance;

	public static  FactoryImpl getInstance() {
		if (instance == null) {
			instance = new FactoryImpl();
		}
		return instance;
	}

	public FactoryImpl() {
		super();
		// TODO Auto-generated constructor stub
	}



}
