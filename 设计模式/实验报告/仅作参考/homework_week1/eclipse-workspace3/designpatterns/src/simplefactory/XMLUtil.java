package simplefactory;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtil {
	public static String getShapeType() {
		try {
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse("E:\\eclipse-workspace3\\designpatterns\\src\\simplefactory\\ShapeFile.xml");
			
			NodeList nl = doc.getElementsByTagName("shapeType");
			Node classNode = nl.item(0).getFirstChild();
			String shapeType = classNode.getNodeValue().trim();
			return shapeType;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
