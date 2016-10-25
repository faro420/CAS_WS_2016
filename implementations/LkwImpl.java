package implementations;

import interfaces.Lkw;
import interfaces.Ort;

public class LkwImpl implements Lkw {

	private Ort pos;
	private Gut ladung;
	private int fuellkapazitaet;
	private int fuellstand;

	private LkwImpl() {
	}

	public Ort getPos() {
		return pos;
	}

	public void setPos(Ort pos) {
		this.pos = pos;
	}

	public Gut getLadung() {
		return ladung;
	}

	public void setLadung(Gut ladung) {
		this.ladung = ladung;
	}

	public int getFuellkapazitaet() {
		return fuellkapazitaet;
	}

	public void setFuellkapazitaet(int fuellkapazitaet) {
		this.fuellkapazitaet = fuellkapazitaet;
	}

	public int getFuellstand() {
		return fuellstand;
	}

	public void setFuellstand(int fuellstand) {
		this.fuellstand = fuellstand;
	}

	public static LkwImpl createLkwImpl() {
		return null;
	}
}
