package implementations;

import java.util.ArrayList;

import interfaces.Auftrag;
import interfaces.LocalServices;

public class BoerseImpl implements LocalServices {

	private ArrayList<Auftrag> verfuegbar;

	private BoerseImpl() {

	}

	public ArrayList<Auftrag> getVerfuegbar() {
		return verfuegbar;
	}

	public void setVerfuegbar(ArrayList<Auftrag> verfuegbar) {
		this.verfuegbar = verfuegbar;
	}

	public static BoerseImpl createBoerseImpl() {
		return null;
	}

}
