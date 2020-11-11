package Ejercicios2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio7 {

	public static void main(String[] args) {
	
try {
			
			String linea;
	
			File file = new File("quijote.txt");
			
			File file2 = new File("salidaInvertida-quijote.txt");
					
			FileReader fileReader = new FileReader(file);
			
			FileWriter fileWriter = new FileWriter(file2);
			
			BufferedReader filebuffer = new BufferedReader(fileReader);	
			
			BufferedWriter writeBuffer = new BufferedWriter(fileWriter);
				
			//BUFFER WRITE
			
			do {
			
			linea = filebuffer.readLine();
			
			StringBuilder builder = new StringBuilder(linea);
			
			String mensajeInvertido = builder.reverse().toString();
			
			writeBuffer.write(mensajeInvertido);
			
			writeBuffer.newLine();
			
			}while(filebuffer.ready()==true);
			
			filebuffer.close();
			
			writeBuffer.close();

			
			}catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			}catch (IOException e) {
				
				e.printStackTrace();
				
			}

	}

}
