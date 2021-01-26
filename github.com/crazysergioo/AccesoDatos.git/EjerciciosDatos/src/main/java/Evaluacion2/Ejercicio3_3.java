package Evaluacion2;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Ejercicio3_3 {

	public static void main(String[] args) {

		/*Qué ítems distintos pueden diferenciarse?
		 
		 * Items→ es un item de información

		 * Pedido → Es un item de información de documento, del cual se sacarán todas las propiedades que el tenga

		 * id → item de información de atributo que corresponde al item Pedido

		 * cliente,producto y fecha→ son items de información de elementos. Son las propiedades de Pedido
		 * 
		*/
		
		/*Qué estructura tienen los distintos ítems
		 
		 * 
		
		 */
		
		int contadorId = 0;
		int contadorCliente = 0;
		int contadorproducto = 0;
		int contadorFecha = 0;
		
		try {

			File file = new File("bbdd.xml");

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();

			Document document = documentBuilder.parse(file);

			document.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();

			NodeList listaPedidos = document.getElementsByTagName("items");

			for (int i = 0; i < listaPedidos.getLength(); i++) {

				Node nodo = listaPedidos.item(i);

				Element element = (Element) nodo;

				if (nodo.getNodeType() == Node.ELEMENT_NODE) {
					
					String id = element.getAttribute("id");
					
					contadorId++;

					String nomclientebre = element.getElementsByTagName("cliente").item(0).getTextContent();
					
					contadorCliente++;
					
					String producto = element.getElementsByTagName("producto").item(0).getTextContent();
					
					contadorproducto++;

					String fecha = element.getElementsByTagName("fecha").item(0).getTextContent();
					
					contadorFecha++;
										
				}

			}
			
			System.out.println("numero de clientes: " + contadorCliente);

			System.out.println("numero de id: " + contadorId);
			
			System.out.println("numero de productos " + contadorproducto);

			System.out.println("numero de fechas: " + contadorFecha);

			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
