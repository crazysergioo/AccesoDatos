package Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReader {

	int contador = 0;
	
	public final String[] TAMAÑOPORDEFECTO = new String [8192];
	
	String RUTAPORDEFECTO = "entrada.txt";

	File file = new File(RUTAPORDEFECTO);
	
	private String [] buffer;
	
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
	
	public BufferedReader(String ruta,String[] buffer) {
		
		setRuta(ruta);
		this.buffer=buffer;
		
	}
	
	
	public String setRuta(String ruta) {
		RUTAPORDEFECTO = ruta;
		return RUTAPORDEFECTO;
	}
	
	public  void readLine() throws IOException {
		
		String readMessage = "";
		
		int i;
		
		try {
		
			file = new File(RUTAPORDEFECTO);
			
			fileReader = new FileReader(file);
			
		while( (i = fileReader.read() ) != -1 ) {	
			
			if(i == 10) {
				
					/*QUE NO HAGA NADA YA QUE AL SER ESE CARACTER SIGNIFICA FIN DE LINEA Y 
					POR LO TANTO LO SIGUIENTE ES ESCRIBIR EN EL SIGUIENTE PARRAFO
					*/
				
			}else {
				
				contador = 0;
	
				buffer[contador] += (char) i;
				
				contador++;
				
			}
		}
		
		for(int j = 0;j<contador;j++) {
			
			System.out.println(buffer[j]);
			
		}
		
//		System.out.println(buffer);
		
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public void close() throws FileNotFoundException {
		
		try {
		file = new File(RUTAPORDEFECTO);
		
		fileReader = new FileReader(file);
		
		fileReader.close();
		
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	
}
