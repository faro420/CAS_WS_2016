package implementations;

import java.util.ArrayList;

import interfaces.Auftrag;
import interfaces.LocalServices;

public class UmladebuchtImpl implements LocalServices {

	private ArrayList<Auftrag> verfuegbar;

	private UmladebuchtImpl() {
	}

	public ArrayList<Auftrag> getVerfuegbar() {
		return verfuegbar;
	}

	public void setVerfuegbar(ArrayList<Auftrag> verfuegbar) {
		this.verfuegbar = verfuegbar;
	}

	public static UmladebuchtImpl createUmladebuchtImpl() {
		return null;
	}

}
