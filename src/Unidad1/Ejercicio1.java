package Unidad1;

import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		Process p=null;
		try {
			rt.exec("C:\\Programs Files\\Mozilla Fiferox\\fiferox.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
