package sk.kosickaakademia.stovcikova.parsexml;

import org.xml.sax.XMLReader;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;

public class VsetkoVPametiSAX {
    /*private String subor;
    private static ArrayList<Otazka> ot = new ArrayList<Otazka>();

    public static ArrayList<Otazka> getOt() {
        return ot;
    }
    public VsetkoVPametiSAX(String subor){
        this.subor=subor;
        try {
            SAXParserFactory uniPar = SAXParserFactory.newInstance();
            uniPar.setValidating(false);
            SAXParser parserSAX1 = uniPar.newSAXParser();
            XMLReader parser = parserSAX1.getXMLReader();
            parser.setErrorHandler(new ChybyZisteneParsovanim());
            parser.parse(subor);
            ot = handler.getZoznam();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }*/
}
