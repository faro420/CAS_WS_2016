package interfaces;

import java.util.ArrayList;

import implementations.FunkImpl;

public interface Funk {
	
	public static Funk create(){
		return new FunkImpl();
	}
	
	public ArrayList<Ort> getVerfuegbar();

	public void setVerfuegbar(ArrayList<Ort> verfuegbar);
	
	public void setVerfuegbar(Ort ort);

}
