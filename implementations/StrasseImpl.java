package implementations;


import interfaces.Ort;
import interfaces.Strasse;

public class StrasseImpl implements Strasse {

	private Ort start, ende;
	private int kosten;
	private String name;

	public StrasseImpl() {
		this(Ort.create(),Ort.create(),0,"") ;
	}
	
	public StrasseImpl(Ort start, Ort ende, int kosten, String name) {
		this.start = start;
		this.ende = ende;
		this.kosten = kosten;
		this.name = name;
	}

	public Ort getStart() {
		return start;
	}

	public void setStart(Ort start) {
		this.start = start;
	}

	public Ort getEnde() {
		return ende;
	}

	public void setEnde(Ort ende) {
		this.ende = ende;
	}

	public int getKosten() {
		return kosten;
	}

	public void setKosten(int kosten) {
		this.kosten = kosten;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
