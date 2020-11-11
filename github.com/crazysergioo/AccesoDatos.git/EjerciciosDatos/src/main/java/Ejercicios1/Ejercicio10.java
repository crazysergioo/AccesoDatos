package Ejercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio10 {

	public static void main(String[] args) {

		String fileEntrada = "C:\\Users\\alumno\\Desktop\\entrada.txt";

		String fileSalida = "..\\..\\..\\..\\..\\..\\salidaInvertida.txt";

		File file1 = new File(fileEntrada);

		File file2 = new File(fileSalida);

		String mensajeInvertido = "";

		try {

			FileReader fileReader = new FileReader(file1);

			FileWriter fileWriter = new FileWriter(file2);

			int i;

			String readMessage = " ";

			while ((i = fileReader.read()) != -1) {

				readMessage += (char) i;

			}

			fileReader.close();

			for (int j = readMessage.length() - 1; j >= 0; j--) {

				mensajeInvertido = mensajeInvertido + readMessage.charAt(j);

			}

			fileWriter.write(mensajeInvertido);

			fileWriter.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
