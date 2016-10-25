package implementations;

import java.util.ArrayList;

import interfaces.Ort;
import interfaces.Strassennetz;

public class StrassennetzImpl implements Strassennetz {

	private ArrayList<Ort> orte;
	private static StrassennetzImpl instance;

	private StrassennetzImpl() {
	}

	public ArrayList<Ort> getOrte() {
		return orte;
	}

	public void setOrte(ArrayList<Ort> orte) {
		this.orte = orte;
	}

	public static synchronized StrassennetzImpl createStrassennetzImpl() {
		if (StrassennetzImpl.instance == null) {
			StrassennetzImpl.instance = new StrassennetzImpl();
		}
		return StrassennetzImpl.instance;

	}
}
