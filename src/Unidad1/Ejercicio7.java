package Unidad1;

import java.io.IOException;

public class Ejercicio7 {

	public static void main(String[] args) {
		String comandoLinux="firefox";
		String comandoWindows="C:\\Program Files\\Mozilla Firefox\\firefox.exe";
		
		String comando=comandoLinux;
		
			
			try {
				ProcessBuilder pb = new ProcessBuilder(comando, "iescristobaldemonroy.net");
				pb.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
