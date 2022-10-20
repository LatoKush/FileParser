import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.helpers.DefaultHandler;

public class XmlParser {

    public static void main(String[] args) {

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new SaxXmlParser();

            File file = new File("File.xml");
            saxParser.parse(file, handler);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}