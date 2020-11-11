package Ejercicios2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {


			File file = new File("quijote.txt");

			File file2 = new File("salidaLetraSustituida-quijote.txt");

			FileReader fileReader = new FileReader(file);

			FileWriter fileWriter = new FileWriter(file2);

			BufferedReader filebuffer = new BufferedReader(fileReader);	

			BufferedWriter writeBuffer = new BufferedWriter(fileWriter);

			char caracterChar;

			int asciiValor;



			do {

				caracterChar = (char) filebuffer.read();

				asciiValor = (int) caracterChar;

				if(asciiValor==162) {
					caracterChar =224;
				}
				writeBuffer.write(caracterChar);
				
		

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
