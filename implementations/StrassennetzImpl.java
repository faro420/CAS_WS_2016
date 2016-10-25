package implementations;

import java.util.ArrayList;

import interfaces.Ort;
import interfaces.Strassennetz;

public class StrassennetzImpl implements Strassennetz {

	private ArrayList<Ort> orte;

	private static final class InstanceHolder {
		static final StrassennetzImpl INSTANCE = new StrassennetzImpl();
	}

	private StrassennetzImpl() {
	}

	public ArrayList<Ort> getOrte() {
		return orte;
	}

	public void setOrte(ArrayList<Ort> orte) {
		this.orte = orte;
	}

	public static StrassennetzImpl getInstance() {
		return InstanceHolder.INSTANCE;
	}
}
