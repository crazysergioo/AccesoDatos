package Evaluacion2;

import java.io.File;
import java.io.FileWriter;
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

public class Ejercicio3 {
	
	static String ruta;
	
	public static void main(String[] args) {

		escribirDatos();
		
	}
	
	public static void escribirDatos() {

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
					
					String apellido = element.getElementsByTagName("apellido").item(0).getTextContent();
					
					String grupo = element.getElementsByTagName("grupo").item(0).getTextContent();

					String fecha = element.getElementsByTagName("fecha").item(0).getTextContent();
					
					
					
					if(grupo.equalsIgnoreCase("DAM")) {
						
						ruta = "DAM/" + apellido + "," + nombre + ".txt";
						
						System.out.println(ruta);
						
						File DAM = new File(ruta);
						
						FileWriter fileWritterDAM = new FileWriter(DAM);
						
						String mensaje;
						
						mensaje = "nombre: " + nombre + "\napellido: " + apellido + "\ngrupo: " + grupo + "\nfecha: " + fecha;
												
						fileWritterDAM.write(mensaje);
						
						fileWritterDAM.close();
						
					}
					else if(grupo.equalsIgnoreCase("ASIR")) {
						
						ruta = "ASIR/" + apellido + "," + nombre + ".txt";
						
						System.out.println(ruta);
						
						File ASIR = new File(ruta);
						
						FileWriter fileWritterASIR = new FileWriter(ASIR);
						
						String mensaje;
						
						mensaje = "nombre: " + nombre + "\napellido: " + apellido + "\ngrupo: " + grupo + "\nfecha: " + fecha;
												
						fileWritterASIR.write(mensaje);
						
						fileWritterASIR.close();
						
					}
					else {
						
						ruta = "SMR/" + apellido + "," + nombre + ".txt";
						
						System.out.println(ruta);
						
						File SMR = new File(ruta);
						
						FileWriter fileWritterSMR = new FileWriter(SMR);
						
						String mensaje;
						
						mensaje = "nombre: " + nombre + "\napellido: " + apellido + "\ngrupo: " + grupo + "\nfecha: " + fecha;
												
						fileWritterSMR.write(mensaje);
						
						fileWritterSMR.close();
					}
				}

			}

//			System.out.println(nombresAlumnos);
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
