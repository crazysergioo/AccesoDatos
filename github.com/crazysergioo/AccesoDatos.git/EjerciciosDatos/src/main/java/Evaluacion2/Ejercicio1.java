package Evaluacion2;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ejercicio1 {

	public static void main(String[] args) {

		String id_alumno = null;

		String [] nombres = {"Lucía","María","Martina","Paula","Sofía","Daniela","Alba","Julia","Carla","Sara","Valeria","Noa","Emma","Claudia","Carmen","Valentina","Ana","Marta","Irene","Adriana","Laura","Elena","Alejandra","Vega","Alma","Laia","Lola","Vera","Olivia","Inés","Aitana","Jimena","Candela","Ariadna","Carlota","Ainhoa","Nora","Triana","Marina","Chloe","Elsa","Alicia","Clara","Blanca","Leire","Mía","Lara","Rocío","Ainara","Nerea","Hugo","Daniel","Pablo","Martín","Alejandro","Adrián","Álvaro","David","Lucas","Mateo","Mario","Manuel","Antonio","Diego","Leo","Javier","Marcos","Izan","Alex","Sergio","Enzo","Carlos","Marc","Jorge","Miguel","Gonzalo","Juan","Ángel","Oliver","Iker","Dylan","Bruno","Eric","Marco","Iván","Nicolás","José","Héctor","Darío","Samuel","Víctor","Rubén","Gabriel","Adam","Aaron","Thiago","Jesús","Aitor","Alberto","Guillermo"};

		String [] apellidos = {"García","González","Rodríguez","Fernández","López","Martínez","Sánchez","Pérez","Gómez","Martín","Jiménez","Ruíz","Hernández","Díaz","Moreno","Muñoz","Álvarez","Romero","Alonso","Gutiérrez","Navarro","Torres","Domínguez","Vázquez","Ramos","Gil","Ramírez","Serrano","Blanco","Molina","Morales","Suárez","Ortega","Delgado","Castro","Ortiz","Rubio","Marín","Sanz","Núñez","Iglesias","Medina","Garrido","Cortes","Castillo","Santos","Lozano","Guerrero","Cano","Prieto","Méndez","Cruz","Calvo","Gallego","Vidal","León","Márquez","Herrera","Peña","Flores","Cabrera","Campos","Vega","Fuentes","Carrasco","Díez","Caballero","Reyes","Nieto","Aguilar","Pascual","Santana","Herrero","Lorenzo","Montero","Hidalgo","Ibáñez","Ferrer","Durán","Santiago","Benítez","Mora","Vicente","Vargas","Arias","Carmona","Crespo","Román","Pastor","Soto","Sáez","Velasco","Moya","Soler","Parra","Esteban","Bravo","Gallardo","Rojas","Casado"};

		String [] grupos = {"DAM","ASIR","SMR"};
		
		String [] cursos = {"1","2"};

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();

		try {

			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			Document doc = docBuilder.newDocument();

			Element rootElement = doc.createElement("alumnos");

			doc.appendChild(rootElement);

			for(int i = 1;i<=100;i++) {

				//ELEMENTO DE ALUMNOS

				Element alumno = doc.createElement("alumno");

				rootElement.appendChild(alumno);

				//VALOR DE LA ID DE CADA ALUMNO

				Attr attr = doc.createAttribute("id");
				
				id_alumno = String.valueOf(i);
				
				attr.setValue(id_alumno);

				alumno.setAttributeNode(attr);
				
				//NOMBRE ALEATORIO
				
				int numeroAleatorio = (int) (Math.random()*100);
				
				Element nombre = doc.createElement("nombre");
				
				nombre.appendChild(doc.createTextNode(nombres[numeroAleatorio]));
				
				alumno.appendChild(nombre);
				
				//APELLIDO ALEATORIO
				
				Element apellido = doc.createElement("apellido");
				
				apellido.appendChild(doc.createTextNode(apellidos[numeroAleatorio]));
				
				alumno.appendChild(apellido);
				
				//GRUPO ALEATORIO
				
				int numerogrupo = (int) (Math.random()*3);
				
				Element grupo = doc.createElement("grupo");
				
				grupo.appendChild(doc.createTextNode(grupos[numerogrupo]));
				
				alumno.appendChild(grupo);
				
				//CURSO ALEATORIO ENTRE 1 Y 2
				
				int numeroCurso = (int) (Math.random()*2);
								
				Element curso = doc.createElement("curso");
				
				curso.appendChild(doc.createTextNode(cursos[numeroCurso]));
				
				alumno.appendChild(curso);
				
				//FECHA ALEATORIA

				LocalDate startDate = LocalDate.of(1980, 1, 1); //start date
			    long start = startDate.toEpochDay();

			    LocalDate endDate = LocalDate.of(2000, 12, 31); //end date
			    long end = endDate.toEpochDay();

			    long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
			    
			    LocalDate fechaLocal = LocalDate.ofEpochDay(randomEpochDay);
			    				
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
			    
			    String formattedString = fechaLocal.format(formatter);
			    				
				Element fechaAleatoria = doc.createElement("fecha");
				
				fechaAleatoria.appendChild(doc.createTextNode(formattedString));
				
				alumno.appendChild(fechaAleatoria);

			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			
			Transformer transformer = transformerFactory.newTransformer();
			
			DOMSource source = new DOMSource(doc);
			
			StreamResult result = new StreamResult(new File("alumnos.xml"));
			
			transformer.transform(source, result);			

		} catch (ParserConfigurationException e) {

			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
