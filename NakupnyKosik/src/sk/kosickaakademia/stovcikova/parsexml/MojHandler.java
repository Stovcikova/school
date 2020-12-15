package sk.kosickaakademia.stovcikova.parsexml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MojHandler extends DefaultHandler {
    private static final int VELKOST_BUFFERU = 100000;
    private StringBuffer hodnota = new StringBuffer(VELKOST_BUFFERU);

    public void text (){
        System.out.println(hodnota);
    }
    public void startDocument (){
        hodnota.setLength(0);
    }
    public void startElement(String uri, String localName, String qName, Attributes attrs){
        if(qName.equals("podnadpis")) hodnota.append("/n");
    }
    public void characters(char[] ch, int start, int dlzka){
        hodnota.append(ch, start, dlzka);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
    }
}
