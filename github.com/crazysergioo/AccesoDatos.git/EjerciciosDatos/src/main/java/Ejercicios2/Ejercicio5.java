package Ejercicios2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Ejercicio5 {

	public static void main(String[] args) {
		
try {
			
			
			File file = new File("quijote.txt");					
			FileReader fileReader = new FileReader(file);
			
			BufferedReader filebuffer = new BufferedReader(fileReader);
			
			String linea;
			
			int sumaTotal = 0;
				
			do {
			
			linea = filebuffer.readLine();
			
			String[] palabras = Pattern.compile("\\s+").split(linea);
			
			sumaTotal = sumaTotal + palabras.length;
			
			}while(filebuffer.ready()==true);
		
			System.out.println("El texto tiene " + sumaTotal + " palabras");
			
			filebuffer.close();
			
			fileReader.close();
			
			}catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			}catch (IOException e) {
				
				e.printStackTrace();
				
			}

	}

}
