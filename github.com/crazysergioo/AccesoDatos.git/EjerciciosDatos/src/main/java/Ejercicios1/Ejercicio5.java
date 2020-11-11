package Ejercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {

	public static void main(String[] args) {

		String fileEntrada = "C:\\Users\\alumno\\Desktop\\entrada.txt";

		File file1 = new File(fileEntrada);

		try {

			FileReader fileReader = new FileReader(file1);

			int i;

			String readMessage = " ";

			int caracteresConTilde = 0;

			while ((i = fileReader.read()) != -1) {

				readMessage += (char) i;

				if (i == 195 || i == 130 || i == 161 || i == 162 || i == 163) {

					caracteresConTilde++;

				}

			}

			fileReader.close();

			System.out.println(caracteresConTilde);
			System.out.println(readMessage);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
