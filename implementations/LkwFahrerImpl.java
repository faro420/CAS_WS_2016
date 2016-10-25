package implementations;

import java.util.ArrayList;

import interfaces.Akteur;
import interfaces.Lkw;

public class LkwFahrerImpl extends AkteurImpl {

	private Lkw lkw;
	private ArrayList<Akteur> freunde;

	private LkwFahrerImpl() {
	}

	public Lkw getLkw() {
		return lkw;
	}

	public void setLkw(Lkw lkw) {
		this.lkw = lkw;
	}

	public ArrayList<Akteur> getFreunde() {
		return freunde;
	}

	public void setFreunde(ArrayList<Akteur> freunde) {
		this.freunde = freunde;
	}

	public static LkwFahrerImpl createLkwFahrerImpl() {
		return null;
	}
}
