package Evaluacion2;

import java.io.File;
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

public class Ejercicio2_2 {

	public static void main(String[] args) {

		listaDeNombres();
		
	}
	
	public static void listaDeNombres() {

		int contadorCurso1Dam = 0;
		int contadorCurso1ASIR = 0;
		int contadorCurso1SMR = 0;
		
		int contadorCurso2Dam = 0;
		int contadorCurso2ASIR = 0;
		int contadorCurso2SMR = 0;


		
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

					System.out.print(nombre + " ");
					
					String apellido = element.getElementsByTagName("apellido").item(0).getTextContent();
					
					String grupo = element.getElementsByTagName("grupo").item(0).getTextContent();

					String fecha = element.getElementsByTagName("fecha").item(0).getTextContent();
					
					String curso = element.getElementsByTagName("curso").item(0).getTextContent();
										
					if(curso.equals("1")) {
						
						if(grupo.equals("DAM")) {
							contadorCurso1Dam++;
						}
						else if(grupo.equals("ASIR")) {
							contadorCurso1ASIR++;
						}
						else {
							contadorCurso1SMR++;
						}
						
						
					}
					else if(curso.equals("2")) {
						
						if(grupo.equals("DAM")) {
							contadorCurso2Dam++;

						}
						else if(grupo.equals("ASIR")) {
							contadorCurso2ASIR++;
						}
						else {
							contadorCurso2SMR++;
						}
					}
					
					
				}

			}

			System.out.println("\nen el curso 1 hay " + contadorCurso1Dam + " alumnos en el grupo DAM");
			System.out.println("en el curso 2 hay " + contadorCurso2Dam + " alumnos en el grupo DAM");
			
			System.out.println("en el curso 1 hay " + contadorCurso1ASIR + " alumnos en el grupo ASIR");
			System.out.println("en el curso 2 hay " + contadorCurso2ASIR + " alumnos en el grupo ASIR");
			
			System.out.println("en el curso 1 hay " + contadorCurso1SMR + " alumnos en el grupo SMR");
			System.out.println("en el curso 2 hay " + contadorCurso2SMR + " alumnos en el grupo SMR");




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
