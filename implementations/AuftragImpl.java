package implementations;

import java.util.ArrayList;

import interfaces.Auftrag;
import interfaces.Ort;

public class AuftragImpl implements Auftrag {
	
	private Ort start,ziel;
	private AuftraggeberImpl auftraggeber;
	private Geldtyp wert;
	private int menge;
	private ArrayList<Auftrag> subauftrag;
	
	public AuftragImpl(){
		
	}

}
