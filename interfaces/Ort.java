package interfaces;
import java.util.ArrayList;

import implementations.FunkImpl;
import implementations.OrtImpl;

public interface Ort {
	
	public static Ort create(){

		return new OrtImpl();
	}
	
	public String getName();

	public void setName(String name);

	public ArrayList<Strasse> getAngebunden();

	public void setAngebunden(ArrayList<Strasse> angebunden);
	public void setAngebunden(Strasse angebunden);

	public ArrayList<FunkImpl> getErreichbar();

	public void setErreichbar(ArrayList<FunkImpl> erreichbar);
	
	
}
