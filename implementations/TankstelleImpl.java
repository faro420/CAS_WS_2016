package implementations;

import interfaces.Akteur;
import interfaces.LocalServices;

public class TankstelleImpl implements LocalServices {

	private Geldtyp preis;
	private int kostenZeit;
	private Akteur belegtDurch; // leiber ne Q? bei mehreren neuen LKWs

	private TankstelleImpl() {

	}

	public Geldtyp getPreis() {
		return preis;
	}

	public void setPreis(Geldtyp preis) {
		this.preis = preis;
	}

	public int getKostenZeit() {
		return kostenZeit;
	}

	public void setKostenZeit(int kostenZeit) {
		this.kostenZeit = kostenZeit;
	}

	public Akteur getBelegtDurch() {
		return belegtDurch;
	}

	public void setBelegtDurch(Akteur belegtDurch) {
		this.belegtDurch = belegtDurch;
	}

	public static TankstelleImpl createTankstelleImpl() {
		return null;
	}
}
