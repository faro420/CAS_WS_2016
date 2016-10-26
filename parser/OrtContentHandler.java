package parser;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

import interfaces.Ort;

public class OrtContentHandler implements ContentHandler {

	private Ort ort;
	private ArrayList<Ort> list;

	public OrtContentHandler(ArrayList<Ort> list) {
		super();
		this.list = list;
	}

	// Aktuelle Zeichen die gelesen werden, werden in eine Zwischenvariable
	// gespeichert
	public void characters(char[] ch, int start, int length) throws SAXException {

	}

	// Methode wird aufgerufen wenn der Parser zu einem Start-Tag kommt
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		if (localName.equals("Ort")) {
			// Neue Ort erzeugen
			ort = Ort.create();

			// Attribut id wird in dem jeweiligen Ort gesetzt
			ort.setName(atts.getValue("id"));
		}
	}

	// Methode wird aufgerufen wenn der Parser zu einem End-Tag kommt
	public void endElement(String uri, String localName, String qName) throws SAXException {

		// Ort in Ortliste abspeichern falls Ort End-Tag erreicht
		// wurde.
		if (localName.equals("ort")) {
			list.add(ort);
			System.out.println("Ort:" + ort);
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