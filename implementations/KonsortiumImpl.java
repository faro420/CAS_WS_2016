package implementations;

import java.util.ArrayList;

import interfaces.Akteur;

public class KonsortiumImpl extends AkteurImpl {

	private ArrayList<Akteur> teilnehmer;

	private KonsortiumImpl() {
	}

	public ArrayList<Akteur> getTeilnehmer() {
		return teilnehmer;
	}

	public void setTeilnehmer(ArrayList<Akteur> teilnehmer) {
		this.teilnehmer = teilnehmer;
	}

	public static KonsortiumImpl createKonsortiumImpl() {
		return null;
	}
}
