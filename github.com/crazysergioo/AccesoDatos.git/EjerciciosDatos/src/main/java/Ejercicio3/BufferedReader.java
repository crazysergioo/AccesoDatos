package Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReader {

	
	public final int TAMAÑOPORDEFECTO = 8192;
	
	String RUTAPORDEFECTO = "quijote.txt";

	File file = new File(RUTAPORDEFECTO);
	
	private int buffer;
	
	FileReader fileReader;
	
	public BufferedReader() {
		
	
	try {
		
	fileReader = new FileReader(file);
	
	}catch (FileNotFoundException e) {
	
		e.printStackTrace();
	
	}
	
	}
	
	public BufferedReader(String ruta) {
		
		setRuta(ruta);
		buffer=TAMAÑOPORDEFECTO;
	}
	
	public BufferedReader(String ruta,int buffer) {
		
		setRuta(ruta);
		this.buffer=buffer;
		
	}
	
	
	public String setRuta(String ruta) {
		RUTAPORDEFECTO = ruta;
		return RUTAPORDEFECTO;
	}
	
	public String readLine() throws IOException {
		
		String readMessage = " ";
		
		int i;
		
		try {
		
			file = new File(RUTAPORDEFECTO);
			
			fileReader = new FileReader(file);
			
		while( (i = fileReader.read() ) != -1 ) {	
			
			if(i == 10) {
				break;
			}else {
			
			readMessage += (char) i;

			}
		}System.out.println(readMessage);
		
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}
		return readMessage;
	}
	
	public void close() {
		
	}
	
	
}
