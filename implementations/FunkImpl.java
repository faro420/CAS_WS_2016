package implementations;

import java.util.ArrayList;

import interfaces.Funk;
import interfaces.Ort;

public class FunkImpl implements Funk {

	private ArrayList<Ort> verfuegbar;

	public FunkImpl() {
		this(new ArrayList<Ort>());
	}
	
	public FunkImpl(ArrayList<Ort> verfuegbar) {
		this.verfuegbar = verfuegbar;
	}

	public ArrayList<Ort> getVerfuegbar() {
		return verfuegbar;
	}

	public void setVerfuegbar(ArrayList<Ort> verfuegbar) {
		this.verfuegbar = verfuegbar;
	}
	
	public void setVerfuegbar(Ort ort) {
		this.verfuegbar.add(ort);
	}
}
