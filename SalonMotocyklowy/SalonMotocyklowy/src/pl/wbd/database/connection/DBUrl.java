package pl.wbd.database.connection;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DBUrl {

	private final String xmlUrl = "res/config.xml";
	private String DBUrl;
	private String sid;

	public DBUrl() {
		try {
			String port = null;
			String host = null;

			File xmlConfig = new File(xmlUrl);

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlConfig);
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("connection");

			Node nNode = nList.item(0);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;
				host = getTagValue("host", eElement);
				port = getTagValue("port", eElement);
				sid = getTagValue("sid", eElement).toLowerCase();
			}
			DBUrl = host + ":" + port;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0)
				.getChildNodes();
		Node nValue = (Node) nlList.item(0);
		return nValue.getNodeValue();
	}

	public String getDBUrl() {
		return DBUrl;
	}

	public String getSid() {
		return sid;
	}
}
