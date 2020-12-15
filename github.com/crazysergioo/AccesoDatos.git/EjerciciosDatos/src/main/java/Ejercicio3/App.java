package Ejercicio3;

import java.io.IOException;


public class App {

	public static void main(String[] args) throws IOException {

//		BufferedReader buffer = new BufferedReader("entrada.txt");
//		
//		buffer.readLine();
//		
//		buffer.close();
		
		PropertiesRafa prop = new PropertiesRafa("datos.properties");
//		
//		System.out.println(prop.getConfiguration("Nombre"));
		
		Properties prop2 = new Properties("datos.properties");
		
//		System.out.println(prop2.getConfiguracion("Nombre"));
		
		prop2.setConfiguracion("Ciudad", "Madrid");
		
//		prop.setConfiguration("Nombre", "Sergio");
		
	}

}
