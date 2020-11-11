package Ejercicios2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio3 {

	public static void main(String[] args) throws FileNotFoundException {

		try {

			File file = new File("quijote.txt");		
			FileReader fileReader = new FileReader(file);

			BufferedReader filebuffer = new BufferedReader(fileReader);

			String linea;

			char caracterChar;

			int asciiValor;

			int contador=0;

			do {

				caracterChar = (char) filebuffer.read();

				asciiValor = (int) caracterChar;

				if(asciiValor==65533) {
					contador++;
				}

			}while(filebuffer.ready()==true);

			filebuffer.close();

			System.out.println("Hay " + contador + " caracteres que no perteneces a la tabla ascii");

		}catch (FileNotFoundException e) {

			e.printStackTrace();

		}catch (IOException e) {

			e.printStackTrace();

		}
	}

}
