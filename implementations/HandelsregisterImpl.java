package implementations;

import java.util.ArrayList;

import interfaces.LocalServices;

public class HandelsregisterImpl implements LocalServices {

	private ArrayList<KonsortiumImpl> eingetragen;

	private HandelsregisterImpl() {
	}

	public ArrayList<KonsortiumImpl> getEingetragen() {
		return eingetragen;
	}

	public void setEingetragen(ArrayList<KonsortiumImpl> eingetragen) {
		this.eingetragen = eingetragen;
	}

	public static HandelsregisterImpl createHandelsregisterImpl() {
		return null;
	}

}
