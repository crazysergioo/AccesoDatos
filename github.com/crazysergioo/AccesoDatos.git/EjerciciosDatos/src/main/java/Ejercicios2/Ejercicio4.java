package Ejercicios2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Ejercicio4 {

	public static void main(String[] args) {
		
try {
			
			
			File file = new File("quijote.txt");
					
			FileReader fileReader = new FileReader(file);
			
			BufferedReader filebuffer = new BufferedReader(fileReader);
			
			char caracterChar;
			
			int mayuscula = 0;
			
			int asciiValor;
			
			
				
			do {
			
			caracterChar = (char) filebuffer.read();
			
			asciiValor = (int) caracterChar;
			
			if(asciiValor>=65 && asciiValor<=90) {
				mayuscula++;
			}
			
			}while(filebuffer.ready()==true);
			
			filebuffer.close();
			
			fileReader.close();
			
			System.out.println("El texto tiene " + mayuscula + " mayusculas");
			
			}catch (FileNotFoundException e) {
				
				e.printStackTrace();
				
			}catch (IOException e) {
				
				e.printStackTrace();
				
			}

	}

}
