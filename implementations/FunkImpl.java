package implementations;

import java.util.ArrayList;

import interfaces.LocalServices;
import interfaces.Ort;

public class FunkImpl implements LocalServices {

	private ArrayList<Ort> verfuegbar;

	private FunkImpl() {

	}

	public ArrayList<Ort> getVerfuegbar() {
		return verfuegbar;
	}

	public void setVerfuegbar(ArrayList<Ort> verfuegbar) {
		this.verfuegbar = verfuegbar;
	}

	public static FunkImpl createFunkImpl() {
		return null;
	}
}
