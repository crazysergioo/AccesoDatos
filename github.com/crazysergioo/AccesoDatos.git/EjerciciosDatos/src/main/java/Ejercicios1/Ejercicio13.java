package Ejercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio13 {

	public static void main(String[] args) {

		String fileEntrada = "C:\\Users\\alumno\\Desktop\\entrada.txt";

		String fileSalida = "..\\..\\..\\..\\..\\..\\salidasSinVocales.txt";

		File file1 = new File(fileEntrada);

		File file2 = new File(fileSalida);

		try {

			FileReader fileReader = new FileReader(file1);

			FileWriter fileWriter = new FileWriter(file2);

			int i;

			String readMessage = " ";

			while ((i = fileReader.read()) != -1) {

				if (i == 97 || i == 101 || i == 105 || i == 111 || i == 117 || i == 65 || i == 69 || i == 73 || i == 79
						|| i == 85) {

					readMessage.replace(" ", "");

				} else {

					readMessage += (char) i;

				}

			}

			fileReader.close();

			fileWriter.write(readMessage);

			fileWriter.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
