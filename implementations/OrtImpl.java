package implementations;

import java.util.ArrayList;

import interfaces.Ort;
import interfaces.Strasse;

public class OrtImpl implements Ort {
	
	private String name;
	private ArrayList<Strasse> angebunden;
	private ArrayList<FunkImpl> erreichbar;
	
	public OrtImpl() {
	}
	
}
