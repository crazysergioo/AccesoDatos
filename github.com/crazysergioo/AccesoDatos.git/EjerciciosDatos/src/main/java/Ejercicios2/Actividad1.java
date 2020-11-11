package Ejercicios2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Actividad1 {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		try {


			File file = new File("quijote.txt");			


			FileReader fileReader = new FileReader(file);

			BufferedReader filebuffer = new BufferedReader(fileReader);

			do {

				String linea = filebuffer.readLine();

				System.out.println(linea);

			}while(filebuffer.ready()==true);

			filebuffer.close();


			long sumaTiempo2 = System.currentTimeMillis()- inicio;

			System.out.println("Con fileBuffer tarda" + sumaTiempo2);  //USANDO SOLO EL BUFFER ME TARDA 492-530 APROXIMADAMENTE

		}catch (FileNotFoundException e) {

			e.printStackTrace();

		}catch (IOException e) {

			e.printStackTrace();

		}

		try {
					
					
					File file = new File("C:\\Users\\Sergee\\Desktop\\quijote.txt");
							
					FileReader fileReader = new FileReader(file);
					
					String readMessage = " ";
					int i;
		
					while ((i = fileReader.read()) != -1) {
		
						readMessage += (char) i;
		
					}
		
					System.out.println(readMessage);
					
					long sumaTiempo = System.currentTimeMillis()- inicio;
					
					System.out.println("Con fileReader tarda" + sumaTiempo); //USANDO SOLO EL FILEREADER TARDA UNOS 380000 APROXIMADAMENTE
					
					fileReader.close();
					
				}catch (FileNotFoundException e) {
			
						e.printStackTrace();
			
					}catch (IOException e) {
			
							e.printStackTrace();
			
						}

	}

}
