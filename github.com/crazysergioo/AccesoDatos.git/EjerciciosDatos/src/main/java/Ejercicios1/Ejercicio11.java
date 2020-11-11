package Ejercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio11 {

	public static void main(String[] args) {

		String fileEntrada = "C:\\Users\\Sergee\\Desktop\\entrada.txt";

		String fileSalida = "..\\..\\..\\..\\..\\..\\salidaLetraSustituida.txt";

		File file1 = new File(fileEntrada);

		File file2 = new File(fileSalida);

		try {

			FileReader fileReader = new FileReader(file1);

			FileWriter fileWriter = new FileWriter(file2);

			int i;

			String readMessage = " ";

			while ((i = fileReader.read()) != -1) {

				if (i == 101) {

					int nuevaLetra = 69;

					i = nuevaLetra;

				}

				readMessage += (char) i;

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
