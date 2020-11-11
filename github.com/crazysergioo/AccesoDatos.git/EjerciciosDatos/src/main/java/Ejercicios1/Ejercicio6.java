package Ejercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) {

		String fileEntrada = "C:\\Users\\Alumno\\Desktop\\entrada.txt";

		File file1 = new File(fileEntrada);

		try {

			FileReader fileReader = new FileReader(file1);

			int i;

			String readMessage = " ";

			int caracteresMayus = 0;

			while ((i = fileReader.read()) != -1) {

				readMessage += (char) i;

				if (i >= 65 && i <= 90) {

					caracteresMayus++;

				}

			}

			fileReader.close();

			System.out.println("Es este texto hay " + caracteresMayus + " may�sculas");

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
