package Evaluacion2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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



public class Ejercicio2 {

	public static void main(String[] args) {
		
		leerConBufferedReader();
		
		listaDeNombres();
		
	}

	public static void leerConBufferedReader() {

		File file = new File("alumnos.xml");

		try {

			FileReader fileReader = new FileReader(file);

			BufferedReader filebuffer = new BufferedReader(fileReader);

			do {

				String linea = filebuffer.readLine();

				System.out.println(linea);
				
				System.out.println();

			}while(filebuffer.ready()==true);

			filebuffer.close();

		}catch (FileNotFoundException e) {

			e.printStackTrace();

		}catch (IOException e) {

			e.printStackTrace();

		}

	}

	public static void listaDeNombres() {

		ArrayList<String> nombresAlumnos = new ArrayList<String>();

		try {

			File file = new File("alumnos.xml");

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();

			Document document = documentBuilder.parse(file);

			document.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();

			NodeList listaAlumnos = document.getElementsByTagName("alumno");

			for (int i = 0; i < listaAlumnos.getLength(); i++) {

				Node nodo = listaAlumnos.item(i);

				Element element = (Element) nodo;

				if (nodo.getNodeType() == Node.ELEMENT_NODE) {

					String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();

					nombresAlumnos.add(nombre);
					
					String apellido = element.getElementsByTagName("apellido").item(0).getTextContent();
					
					String grupo = element.getElementsByTagName("grupo").item(0).getTextContent();

					String fecha = element.getElementsByTagName("fecha").item(0).getTextContent();
				}

			}

			System.out.println(nombresAlumnos);
//			
//			System.out.println(nombresAlumnos.size());

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
