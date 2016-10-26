package interfaces;

import implementations.StrasseImpl;

public interface Strasse {

	public static Strasse create(){
		return new StrasseImpl();
	}
	
	public Ort getStart();

	public void setStart(Ort start);

	public Ort getEnde();

	public void setEnde(Ort ende);

	public int getKosten();

	public void setKosten(int kosten);

	public String getName();

	public void setName(String name);
	
}
