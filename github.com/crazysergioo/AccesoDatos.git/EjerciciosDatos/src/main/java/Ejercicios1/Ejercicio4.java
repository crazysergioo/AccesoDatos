package Ejercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {

	public static void main(String[] args) {

		String fileEntrada = "C:\\Users\\Sergee\\Desktop\\entrada.txt";

		File file1 = new File(fileEntrada);

		try {

			FileReader fileReader = new FileReader(file1);

			int i;

			String readMessage = " ";

			int caracteres = 0;

			while ((i = fileReader.read()) != -1) {

				readMessage += (char) i;

				caracteres++;

			}

			fileReader.close();

			System.out.println("En este fichero hay " + (caracteres - 1) + " caracteres");

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
