package Ejercicios2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {

	public static void main(String[] args) throws FileNotFoundException {
		
		long inicio = System.currentTimeMillis();
		
try {
			
			String linea;
	
			File file = new File("quijote.txt");
			
			File file2 = new File("salida-quijote.txt");
					
			FileReader fileReader = new FileReader(file);
			
			FileWriter fileWriter = new FileWriter(file2);
			
			BufferedReader filebuffer = new BufferedReader(fileReader);	
			
			BufferedWriter writeBuffer = new BufferedWriter(fileWriter);
				
			//BUFFER WRITE
			
			do {
			
			linea = filebuffer.readLine();
			
			writeBuffer.write(linea);
			
			writeBuffer.newLine();
			
			}while(filebuffer.ready()==true);
			
			filebuffer.close();
			
			writeBuffer.close();
			
			long sumaTiempo = System.currentTimeMillis()- inicio;
			
			System.out.println("Con bufferWrite tarda" + sumaTiempo); //59
			
			
			
			
			}catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			}catch (IOException e) {
				
				e.printStackTrace();
				
			}

try {

		File file = new File("C:\\Users\\Sergee\\Desktop\\quijote.txt");

		File file2 = new File("..\\..\\..\\..\\..\\..\\salida-quijote.txt");
		
		FileReader fileReader = new FileReader(file);

		FileWriter fileWriter = new FileWriter(file2);

		int i;

		String readMessage = " ";

		while ((i = fileReader.read()) != -1) {

			readMessage += (char) i;

		}

		fileReader.close();

		fileWriter.write(readMessage);

		fileWriter.close();

		long sumaTiempo2 = System.currentTimeMillis()- inicio;

		System.out.println("Con fileWriter tarda" + sumaTiempo2); //395379 aproximadamente


	}catch (FileNotFoundException e) {
	
	e.printStackTrace();
	
	}catch (IOException e) {
	
	e.printStackTrace();
	
}
	}

}
