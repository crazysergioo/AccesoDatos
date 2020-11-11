	package Ejercicios2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.text.WordUtils;


public class Ejercicio9 {

	public static void main(String[] args) {
		
		try {


			File file = new File("quijote.txt");

			File file2 = new File("SalidaMayusculas-quijote.txt");

			FileReader fileReader = new FileReader(file);

			FileWriter fileWriter = new FileWriter(file2);

			BufferedReader filebuffer = new BufferedReader(fileReader);	

			BufferedWriter writeBuffer = new BufferedWriter(fileWriter);

			do {

				String linea = filebuffer.readLine();
				
				writeBuffer.write(WordUtils.capitalize(linea.toString()));
		
				writeBuffer.newLine();

			}while(filebuffer.ready()==true);

			filebuffer.close();

			fileReader.close();
			
			writeBuffer.close();

		}catch (FileNotFoundException e) {

			e.printStackTrace();

		}catch (IOException e) {

			e.printStackTrace();

		}

	}

}
