package implementations;

import java.util.ArrayList;

import interfaces.Akteur;

public class AuftraggeberImpl extends AkteurImpl {
	private ArrayList<Akteur> bekannteFahrer = new ArrayList<Akteur>();

	public AuftraggeberImpl() {
		super();
	}

	public ArrayList<Akteur> getBekannteFahrer() {
		return bekannteFahrer;
	}

	public void setBekannteFahrer(ArrayList<Akteur> bekannteFahrer) {
		this.bekannteFahrer = bekannteFahrer;
	}

	public static AuftraggeberImpl createAuftraggeberImpl() {
		return null;
	}
}
