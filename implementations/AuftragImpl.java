package implementations;

import java.util.ArrayList;

import interfaces.Auftrag;
import interfaces.Ort;

public class AuftragImpl implements Auftrag {

	private Ort start, ziel;
	private AuftraggeberImpl auftraggeber;
	private Geldtyp wert;
	private int menge;
	private ArrayList<Auftrag> subauftrag;

	private AuftragImpl() {

	}

	public Ort getStart() {
		return start;
	}

	public Ort getZiel() {
		return ziel;
	}

	public AuftraggeberImpl getAuftraggeber() {
		return auftraggeber;
	}

	public Geldtyp getWert() {
		return wert;
	}

	public int getMenge() {
		return menge;
	}

	public ArrayList<Auftrag> getSubauftrag() {
		return subauftrag;
	}

	public void setSubauftrag(ArrayList<Auftrag> subauftrag) {
		this.subauftrag = subauftrag;
	}

	public static AuftragImpl createAuftragImpl() {
		return null;
	}

}
