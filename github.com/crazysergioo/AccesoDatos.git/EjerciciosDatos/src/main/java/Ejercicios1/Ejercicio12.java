package Ejercicios1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		String fileEntrada = "C:\\Users\\alumno\\Desktop\\entrada.txt";	
		
		String fileSalida = "..\\..\\..\\..\\..\\..\\salidasMayusculas.txt";

		File file1 = new File(fileEntrada);
		
		File file2 = new File(fileSalida);
		
		
		try{
			
			FileReader fileReader = new FileReader(file1);
			
			FileWriter fileWriter = new FileWriter(file2);
			
			int i;
			
			String readMessage = " ";
			
			String primeraLetra = "";
			
			String primeraNuevaLetra = "";
			
			while( (i = fileReader.read() ) != -1 ) {		
				
				readMessage += (char) i;		
				
	
			}
			
			
			String[] division = readMessage.split(" ");
			
			for (int j = 0; j < division.length; j++) {
				
				for(int x =0;x<27;x++) {
			
//				if(division[j].startsWith(Minusculas.values())==true) {
//					
//				}
					
					
				}
			}
			
			
			fileReader.close();
			
			
			
			System.out.println();
//			fileWriter.write(readMessage);
			
			fileWriter.close();
			
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}


	}

}
