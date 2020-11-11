package Ejercicios2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.stream.Stream;


public class Actividad2 {

	public static void main(String[] args) {


		try {


			File file = new File("quijote.txt");					
			FileReader fileReader = new FileReader(file);

			BufferedReader filebuffer = new BufferedReader(fileReader);

			String linea;

			int sumaTotal = 0;

			int caracteres = 0;

			do {

				linea = filebuffer.readLine();

				String[] palabras = Pattern.compile("\\s+").split(linea);

				sumaTotal = sumaTotal + palabras.length;

				for(int i =0; i<palabras.length;i++) {

					caracteres = caracteres + palabras[i].length();
				}



			}while(filebuffer.ready()==true);

			filebuffer.close();

			fileReader.close();

			System.out.println("El texto tiene " + caracteres + " caracteres");

			System.out.println("El fichero tiene un tama�o de " + file.length()); //NO ES EL MISMO TAMA�O YA QUE EN EL TAMA�O DEL FICHERO SE CUENTAS LOS ESPACIOS.
		}catch (FileNotFoundException e) {

			e.printStackTrace();

		}catch (IOException e) {

			e.printStackTrace();

		}

	}

}
