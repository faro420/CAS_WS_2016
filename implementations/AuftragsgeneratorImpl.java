package implementations;

import java.util.ArrayList;

import interfaces.Auftragsgenerator;
import interfaces.Ort;

public class AuftragsgeneratorImpl implements Auftragsgenerator {

	private ArrayList<Ort> zustaendigFuer;
	private int aktivitaetsrate;

	private AuftragsgeneratorImpl() {

	}

	public ArrayList<Ort> getZustaendigFuer() {
		return zustaendigFuer;
	}

	public void setZustaendigFuer(ArrayList<Ort> zustaendigFuer) {
		this.zustaendigFuer = zustaendigFuer;
	}

	public int getAktivitaetsrate() {
		return aktivitaetsrate;
	}

	public void setAktivitaetsrate(int aktivitaetsrate) {
		this.aktivitaetsrate = aktivitaetsrate;
	}

	public static AuftragsgeneratorImpl createAuftragsgeneratorImpl() {
		return null;
	}

}
