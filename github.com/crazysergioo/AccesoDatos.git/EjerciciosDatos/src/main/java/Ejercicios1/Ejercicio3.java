package Ejercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) {

		String fileEntrada = "C:\\Users\\Sergee\\Desktop\\entrada.txt";

		File file1 = new File(fileEntrada);

		try {

			FileReader fileReader = new FileReader(file1);

			int i;

			String readMessage = " ";

			while ((i = fileReader.read()) != -1) {

				readMessage += (char) i;

			}

			System.out.println(readMessage);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
