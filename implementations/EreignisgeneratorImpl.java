package implementations;

import java.util.ArrayList;

import interfaces.Ereignisgenerator;
import interfaces.Ort;

/*
 * erfordert die Implementierung von Verzoegerung
 */

public class EreignisgeneratorImpl implements Ereignisgenerator {

	private ArrayList<Ort> zustaendigkeitsBereich;
	private int aktivitaetsrate;

	private EreignisgeneratorImpl() {

	}

	public ArrayList<Ort> getZustaendigkeitsBereich() {
		return zustaendigkeitsBereich;
	}

	public void setZustaendigkeitsBereich(ArrayList<Ort> zustaendigkeitsBereich) {
		this.zustaendigkeitsBereich = zustaendigkeitsBereich;
	}

	public int getAktivitaetsrate() {
		return aktivitaetsrate;
	}

	public void setAktivitaetsrate(int aktivitaetsrate) {
		this.aktivitaetsrate = aktivitaetsrate;
	}

	public static EreignisgeneratorImpl createEreignisgeneratorImpl() {
		return null;
	}
}
