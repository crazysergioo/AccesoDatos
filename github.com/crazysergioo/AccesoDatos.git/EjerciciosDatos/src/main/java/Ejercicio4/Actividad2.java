package Ejercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Actividad2 {

	public static void main(String[] args) {
		
		File file = new File("himno.notas");
		
		try {
			
			FileInputStream fileinputStream = new FileInputStream(file);
			
			InputStreamReader inputStreamReader = new InputStreamReader(fileinputStream,StandardCharsets.UTF_8);
			
			StringBuilder readMessage = new StringBuilder();
			
			int i;
			
			while((i = inputStreamReader.read())!=-1){
				
				if(i==7) {
					readMessage.append("SI" + " ");
				}
				else if(i==0){
					readMessage.append( "SILENCIO" + " ");
				}
				else if(i==1){
					readMessage.append( "DO" + " ");
				}
				else if(i==2){
					readMessage.append( "RE" + " ");
				}
				else if(i==6){
					readMessage.append( "LA" + " ");
				}
				else if(i==5){
					readMessage.append( "SOL" + " ");
				}
				else if(i==3){
					readMessage.append( "MI" + " ");
				}
				else if(i==4){
					readMessage.append( "FA" + " ");
				}
				
				
				
				
			}
			
			inputStreamReader.close();
			
			System.out.println(readMessage);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}

	}

}
