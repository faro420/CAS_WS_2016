package implementations;

import java.util.ArrayList;

import interfaces.LocalServices;

public class BankImpl implements LocalServices {

	private ArrayList<Konto> konten;
	private static BankImpl instance;

	private BankImpl() {

	}

	public ArrayList<Konto> getKonten() {
		return konten;
	}

	public void setKonten(ArrayList<Konto> konten) {
		this.konten = konten;
	}

	public static BankImpl createBankImpl() {
		if (BankImpl.instance == null) {
			BankImpl.instance = new BankImpl();
		}
		return BankImpl.instance;
	}

}
