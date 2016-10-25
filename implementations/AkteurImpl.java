package implementations;

import java.util.ArrayList;

import interfaces.Akteur;
import interfaces.Auftrag;

public abstract class AkteurImpl implements Akteur {

	private ArrayList<Auftrag> auftraege = new ArrayList<Auftrag>();
	private Geldtyp kontostand;
	private ArrayList<Akteur> bekannte;
	
}
