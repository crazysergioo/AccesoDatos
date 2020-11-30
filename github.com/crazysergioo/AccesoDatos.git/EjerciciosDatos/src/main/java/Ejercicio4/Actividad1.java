package Ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;



public class Actividad1 {

	public static void main(String[] args) {
		
		String valorSilencio = "00000000";
		
		String valorSI = "00000111";
		
		String valorDO = "00000001";
		
		String valorRE = "00000010";
		
		String valorMI = "00000011";
		
		String valorFA = "00000100";
		
		String valorSOL = "00000101";
		
		String valorLA = "00000110";

		File file = new File("himno.txt");
		
		File file2 = new File("himno.notas.txt");
		
		File file3 = new File("himno.hash.txt");
		
		try {
			
			FileOutputStream fileOutputStreamHash = new FileOutputStream(file3);
			
			FileInputStream fileinputStream = new FileInputStream(file);
			
			FileOutputStream fileOutPutStream = new FileOutputStream(file2);
			
			OutputStreamWriter outPutStreamWritter = new OutputStreamWriter(fileOutPutStream, StandardCharsets.UTF_8);
			
			OutputStreamWriter OutputStreamWritterHash = new OutputStreamWriter(fileOutputStreamHash,StandardCharsets.UTF_8);
			
			InputStreamReader inputStreamReader = new InputStreamReader(fileinputStream,StandardCharsets.UTF_8);
			
			BufferedWriter bufferedWritter = new BufferedWriter(outPutStreamWritter);
			
			BufferedWriter bufferedWritterHash = new BufferedWriter(OutputStreamWritterHash);
			
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			int i;
			
			String readMessage = " ";
			
			String hash = "";
			
			do {
				
				
				
				readMessage = bufferedReader.readLine();
				
				String[] palabras = Pattern.compile("\\s+").split(readMessage);
				
				for(int j = 0;j<palabras.length;j++) {
					
					if(palabras[j].equals("SILENCIO")) {
						
						bufferedWritter.write(valorSilencio);
						
					}
					else if(palabras[j].equals("SI")) {
						
						bufferedWritter.write(valorSI);
						
					}
					else if(palabras[j].equals("DO")) {
						
						bufferedWritter.write(valorDO);
						
					}
					else if(palabras[j].equals("RE")) {
						
						bufferedWritter.write(valorRE);
						
					}
					else if(palabras[j].equals("MI")) {
						
						bufferedWritter.write(valorMI);
						
					}
					else if(palabras[j].equals("FA")) {
						
						bufferedWritter.write(valorFA);
						
					}
					else if(palabras[j].equals("SOL")) {
						
						bufferedWritter.write(valorSOL);
						
					}
					else if(palabras[j].equals("LA")) {
						
						bufferedWritter.write(valorLA);
						
					}
					
					
				}
				
				System.out.println(readMessage);
				
			}while (bufferedReader.ready()==true); 
			
			bufferedReader.close();
			
			bufferedWritter.close();
			
			String md5 = " ";
			
			for(int x = 0;x<readMessage.length();x++) {
				
//				md5 += Integer.toHexString((readMessage))
				
			}
			
			
			
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
		
		//interfaz del dibujo clase jpanel( implementar paint component)  y jframe
		
	}

}
