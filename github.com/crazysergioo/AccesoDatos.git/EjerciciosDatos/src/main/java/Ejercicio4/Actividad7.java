package Ejercicio4;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
 
public class Actividad7 extends JFrame{
	
	ImageIcon imagen = new ImageIcon("foto");
 
	JLabel etiqueta = new JLabel(imagen);

	public Actividad7(){
	
		super("");

		getContentPane().add(etiqueta);

		this.setSize(300, 350);
 
	}
 
 
	public static void main(String H[]){
		
		Actividad7 actividad7 = new Actividad7();
		
		actividad7.show();

		actividad7.addWindowListener(new WindowAdapter(){
		
			public void windowClosing(WindowEvent evt){
			
				System.exit(0);
				
			}
		});
	}
 
}

