package Unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio2v12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt =Runtime.getRuntime();
		String comandoLinux="ls";
		String comandoWindows = "CMD /C DIR";
		
		Process p = null;
		try {
			p =rt.exec(comandoWindows);
			InputStream is=p.getInputStream();
			BufferedReader br = new BufferedReader (new InputStreamReader(is));
			String linea;
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
