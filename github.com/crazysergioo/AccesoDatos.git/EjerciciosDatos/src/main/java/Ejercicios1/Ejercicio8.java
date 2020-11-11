package Ejercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8 {

	public static void main(String[] args) {
		try {

			FileWriter fileWriter = new FileWriter("..\\..\\..\\..\\..\\..\\fibonacci.txt");

			int numero;

			double fibonacci1;

			double fibonacci2;

			int i;

			String readMessage = " ";

			fibonacci1 = 1;
			fibonacci2 = 1;

			for (i = 2; i <= 1000; i++) {

				System.out.print(fibonacci2 + " ");

				readMessage += fibonacci2 + " ";

				fibonacci2 = fibonacci1 + fibonacci2;
				fibonacci1 = fibonacci2 - fibonacci1;

			}

			fileWriter.write(readMessage);

			fileWriter.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
