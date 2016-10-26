package parser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import interfaces.Factory;
import interfaces.Ort;
import interfaces.Strasse;

public class Reader {
  public static void main(String[] args) {
    try {
      // XMLReader erzeugen
      XMLReader xmlReader = XMLReaderFactory.createXMLReader();
      
      // Pfad zur XML Datei
      FileReader reader = new FileReader("init.xml");
      InputSource inputSource = new InputSource(reader);

      // DTD kann optional übergeben werden
      // inputSource.setSystemId("init.xml");
      ArrayList<Ort> list = new ArrayList<Ort>();
      ArrayList<Strasse> alleStrasse = new ArrayList<Strasse>();
      
      // OrtContentHandler wird übergeben
      xmlReader.setContentHandler(new OrtContentHandler(list));
      // StrassenContentHandler wird übergeben
      xmlReader.setContentHandler(new StrassenContentHandler(list,alleStrasse));

      // Parsen wird gestartet
      xmlReader.parse(inputSource);
      //Uebergibt der Factory alle Listen
     Factory.create(/*list,alleStrasse*/);
     
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (SAXException e) {
      e.printStackTrace();
    }
  }
}