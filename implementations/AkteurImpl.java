package implementations;

import java.util.ArrayList;

import interfaces.Akteur;
import interfaces.Auftrag;

public abstract class AkteurImpl implements Akteur {

	public AkteurImpl() {

	}

	private ArrayList<Auftrag> auftraege = new ArrayList<Auftrag>();
	private Geldtyp kontostand;
	private ArrayList<Akteur> bekannte;

	public ArrayList<Auftrag> getAuftraege() {
		return auftraege;
	}

	public void setAuftraege(ArrayList<Auftrag> auftraege) {
		this.auftraege = auftraege;
	}

	public Geldtyp getKontostand() {
		return kontostand;
	}

	public void setKontostand(Geldtyp kontostand) {
		this.kontostand = kontostand;
	}

	public ArrayList<Akteur> getBekannte() {
		return bekannte;
	}

	public void setBekannte(ArrayList<Akteur> bekannte) {
		this.bekannte = bekannte;
	}
}
