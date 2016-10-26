package parser;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

import interfaces.Ort;
import interfaces.Strasse;

public class StrassenContentHandler implements ContentHandler {

	private ArrayList<Strasse> alleStrasse;
	private String currentValue;
	private Strasse strasse;
	private ArrayList<Ort> list;

	public StrassenContentHandler(ArrayList<Ort> list, ArrayList<Strasse> alleStrasse) {
		super();
		this.list = list;
		this.alleStrasse = alleStrasse;
	}

	// Aktuelle Zeichen die gelesen werden, werden in eine Zwischenvariable
	// gespeichert
	public void characters(char[] ch, int start, int length) throws SAXException {
		currentValue = new String(ch, start, length);
	}

	// Methode wird aufgerufen wenn der Parser zu einem Start-Tag kommt
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		if (localName.equals("Strasse")) {
			// Neue Strasse erzeugen
			strasse = Strasse.create();

			// Attribut id wird in der jeweiligen Strasse gesetzt
			strasse.setName(atts.getValue("id"));
		}
	}

	// Methode wird aufgerufen wenn der Parser zu einem End-Tag kommt
	public void endElement(String uri, String localName, String qName) throws SAXException {

		// Anfangsort setzen
		if (localName.equals("anfang")) {
			Ort ort = null;
			for (Ort x : list) {
				if (x.getName().contentEquals(currentValue)) {
					ort = x;
					break;
				}
			}
			strasse.setStart(ort);
			ort.setAngebunden(strasse);
		}

		// Endort setzen
		if (localName.equals("ende")) {
			Ort ort = null;
			for (Ort x : list) {
				if (x.getName().contentEquals(currentValue)) {
					ort = x;
					break;
				}
			}
			strasse.setStart(ort);
		}

		// Kosten setzen
		if (localName.equals("kosten")) {
			strasse.setKosten(Integer.parseInt(currentValue));
		}

		// Strasse in Strassenliste abspeichern falls Strasse End-Tag erreicht
		// wurde.
		if (localName.equals("strasse")) {
			alleStrasse.add(strasse);
			System.out.println("Strasse: " + strasse);
		}
	}

	public void endDocument() throws SAXException {
	}

	public void endPrefixMapping(String prefix) throws SAXException {
	}

	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
	}

	public void processingInstruction(String target, String data) throws SAXException {
	}

	public void setDocumentLocator(Locator locator) {
	}

	public void skippedEntity(String name) throws SAXException {
	}

	public void startDocument() throws SAXException {
	}

	public void startPrefixMapping(String prefix, String uri) throws SAXException {
	}
}