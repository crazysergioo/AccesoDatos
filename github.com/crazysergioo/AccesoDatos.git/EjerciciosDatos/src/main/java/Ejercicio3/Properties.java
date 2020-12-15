package Ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.regex.Pattern;


public class Properties {

	private File file;
	
	public Properties(String ruta) throws IOException {
		
		file = new File(ruta);
		
		file.createNewFile();
		
	}
	
	public String getConfiguracion(String clave) throws IOException {
		
		
		return this.getConfiguracion(clave, null);
	}
	
	public String getConfiguracion(String clave,String valor) throws IOException {
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String readMessage;
		
		while((readMessage = bufferedReader.readLine()) != null) {
			
			String [] claves = Pattern.compile("=").split(readMessage);
			
			
				
				if(claves[0].trim().equals(clave)) {
					
					bufferedReader.close();
					
					return claves[1];
				}
				
			
			
		}
		
		bufferedReader.close();
		
		return valor;
		
	}
	
	public void setConfiguracion(String clave,String valor) throws IOException {
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		FileWriter fileWriter = new FileWriter(file);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		StringBuilder readMessage = new StringBuilder();
		
		String linea;
		
		boolean actualizado=false;
		
		while((linea = bufferedReader.readLine()) != null) {
			
			String [] claves = Pattern.compile("=").split(readMessage);
			
			if(claves[0].trim().equals(clave)) {

					readMessage.append(claves[0]).append("=").append(valor).append("\n");
					
					System.out.println("Valor actualizado");
					
					actualizado=true;
				
			}else {
				
				readMessage.append(linea).append("\n");
				
				System.out.println("clave y valor escrito");
				
			}
			
		}
		
		bufferedReader.close();
		
		if(!actualizado) {
			
			readMessage.append(clave).append("=").append(valor).append("\n");
			
		}
		
		bufferedWriter.write(readMessage.toString());
		
		bufferedWriter.close();
		
	}
	
}
