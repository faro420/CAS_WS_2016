package implementations;

import java.util.ArrayList;

import interfaces.LocalServices;

public class SchwarzesBrettImpl implements LocalServices {

	private ArrayList<Nachrichten> angepinnt;

	private SchwarzesBrettImpl() {
	}

	public ArrayList<Nachrichten> getAngepinnt() {
		return angepinnt;
	}

	public void setAngepinnt(ArrayList<Nachrichten> angepinnt) {
		this.angepinnt = angepinnt;
	}

	public static SchwarzesBrettImpl createSchwarzesBrettImpl() {
		return null;
	}

}
