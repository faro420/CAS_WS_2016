package implementations;

import interfaces.Akteur;
import interfaces.LocalServices;

public class TankstelleImpl implements LocalServices {

	private Geldtyp preis;
	private int kostenZeit;
	private Akteur belegtDurch;	//leiber ne Q? bei mehreren neuen LKWs
	
	public TankstelleImpl() {
		
	}

}
