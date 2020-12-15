package Ejercicio4;

	import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
// 
//public class Actividad3
//{
//	public static Clip getSound(String file)
//	{
//		try
//		{
//			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("musica").getAbsoluteFile());
//			AudioFormat format = audioInputStream.getFormat();
//			DataLine.Info info = new DataLine.Info(Clip.class, format);
//			Clip sound = (Clip)AudioSystem.getLine(info);
//			sound.open(audioInputStream);
//			return sound;
//		}
//		catch(Exception e)
//		{
//			return null;
//		}
//	}
// 
//	public static void playSound(Clip clip)
//	{
//		clip.stop();
//		clip.setFramePosition(0);
//		clip.start();
//	}
// 
//	public static void main(String[] args)
//	{
//		Clip sound = getSound("musica");
//		playSound(sound);
//	}
//}

//public class Actividad3 {
//	   public static void main(String[] args) {
//		   
//		   
//	      try {
//	         Clip sonido = AudioSystem.getClip();
//	         File a = new File("musica");
//	         sonido.open(AudioSystem.getAudioInputStream(a));
//	         sonido.start();
//	         System.out.println("Reproduciendo 10s. de sonido...");
//	         Thread.sleep(10000); 
//	         sonido.close();
//	      } catch (Exception tipoError) {
//	         System.out.println("" + tipoError);
//	      }
//	   }
//	}


