package implementations;

import java.util.ArrayList;

import interfaces.Ort;
import interfaces.Strasse;

public class OrtImpl implements Ort {

	private String name;
	private ArrayList<Strasse> angebunden;
	private ArrayList<FunkImpl> erreichbar;

	public OrtImpl() {
		this("", new ArrayList<Strasse>(), new ArrayList<FunkImpl>());
	}

	public OrtImpl(String name, ArrayList<Strasse> angebunden, ArrayList<FunkImpl> erreichbar) {
		super();
		this.name = name;
		this.angebunden = angebunden;
		this.erreichbar = erreichbar;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Strasse> getAngebunden() {
		return angebunden;
	}

	public void setAngebunden(ArrayList<Strasse> angebunden) {
		this.angebunden = angebunden;
	}

	public ArrayList<FunkImpl> getErreichbar() {
		return erreichbar;
	}

	public void setErreichbar(ArrayList<FunkImpl> erreichbar) {
		this.erreichbar = erreichbar;
	}

	public static OrtImpl createOrtImpl() {
		return null;
	}

	@Override
	public void setAngebunden(Strasse angebunden) {
		this.angebunden.add(angebunden);
		
	}

}
