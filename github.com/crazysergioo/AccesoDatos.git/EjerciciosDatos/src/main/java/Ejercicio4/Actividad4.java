package Ejercicio4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Actividad4 {

	public static void main(String[] args) {

		File file = new File("imagen");
		
		File file2 = new File("imagen2");
		
		FileInputStream fileinputStream;
		
		FileOutputStream fileoutPutStream;	
		
		try {
			
			fileinputStream = new FileInputStream(file);
			
			InputStreamReader leector = new InputStreamReader(fileinputStream,StandardCharsets.UTF_8);
			
			fileoutPutStream = new FileOutputStream(file2);
			
			byte [] lectura = new byte [1904];
			
			StringBuilder readMessage = new StringBuilder();
			
			int i;
			
			int j = 0;
			
			while((i = leector.read())!=-1){
				
				
				readMessage.append(i + " ");
				
					
					if(i==0) {
						
//						lectura[j] = '/u0020';
						
					}
					else if(i==1) {
						lectura[j] = '\u002E';
					}
					else if(i==2) {
						lectura[j] =  '\u002C';
					}
					else if(i==3) {
						lectura[j] = '\u003B';
					}
					else if(i==4) {
						lectura[j] =  '\u0025';
					}
					else if(i==5) {
						lectura[j] = '\u002F';
					}
					else if(i==6) {
						lectura[j] =  '\u0040';
					}
					else if(i==7) {
						lectura[j] =  '\u0061';
					}
//					else if(i==8) {
//						lectura[j] = (char) '\u0027';
//					}
					else if(i==9) {
						lectura[j] =  '\u0060';
					}
					else if(i==10) {
						lectura[j] = '\u0053';
					}
					else if(i==11) {
						lectura[j] =  '\u0073';
					}
//					else if(i==12) {
//						lectura[j] = (char) '\u0030’';
//					}
				
					j++;
					
				}
				
			
			
			fileoutPutStream.write(lectura);
			
			fileoutPutStream.close();
			
			leector.close();
			
			System.out.println(readMessage);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
