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
		
		byte valorSilencio = 00000000;
		
		byte valorSI = 0b00000111;
		
		byte valorDO = 0b00000001;
		
		byte valorRE = 0b00000010;
		
		byte valorMI = 0b00000011;
		
		byte valorFA = 0b00000100;
		
		byte valorSOL = 0b00000101;
		
		byte valorLA = 0b00000110;

		File file = new File("himno.txt");
		
		File file2 = new File("himno.notas");
		
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
			
			CalcularMd5 md5 = new CalcularMd5();
			
			do {
				
				
				
				readMessage = bufferedReader.readLine();
				
				String[] palabras = Pattern.compile("\\s+").split(readMessage);
				
				byte [] arrayBits = new byte [palabras.length];
				
				for(int j = 0;j<palabras.length;j++) {
					
					if(palabras[j].equals("SILENCIO")) {
						
						arrayBits[j] = valorSilencio;
						
						bufferedWritter.write(arrayBits[j]);
						
					}
					else if(palabras[j].equals("SI")) {
						
						arrayBits[j] = valorSI;
						
						bufferedWritter.write(arrayBits[j]);
						
					}
					else if(palabras[j].equals("DO")) {
						
						arrayBits[j] = valorDO;
						
						bufferedWritter.write(arrayBits[j]);
						
					}
					else if(palabras[j].equals("RE")) {
						
						arrayBits[j] = valorRE;
						
						bufferedWritter.write(arrayBits[j]);
						
					}
					else if(palabras[j].equals("MI")) {
						
						arrayBits[j] = valorMI;
						
						bufferedWritter.write(arrayBits[j]);
						
					}
					else if(palabras[j].equals("FA")) {
						
						arrayBits[j] = valorFA;
						
						bufferedWritter.write(arrayBits[j]);
						
					}
					else if(palabras[j].equals("SOL")) {
						
						arrayBits[j] = valorSOL;
						
						bufferedWritter.write(arrayBits[j]);
						
					}
					else if(palabras[j].equals("LA")) {
						
						arrayBits[j] = valorLA;
						
						bufferedWritter.write(arrayBits[j]);
						
					}
					
					
				}
				
				System.out.println(readMessage);
				
			}while (bufferedReader.ready()==true); 
			
			bufferedReader.close();
			
			bufferedWritter.close();
				
			System.out.println(md5.obtenerMD5ComoString("himno.notas"));
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}catch (Exception e) {
			
		}
		
		//interfaz del dibujo clase jpanel( implementar paint component)  y jframe
		
	}

}
