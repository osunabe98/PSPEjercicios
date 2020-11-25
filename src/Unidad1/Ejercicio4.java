package Unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio4 {

	public static void main(String[] args) {
		//take the runtime of java application
		Runtime builder = Runtime.getRuntime();
		//execute commands line
		String comandoLinux="lss";
		String comandoWindows = "CMD /C DIRR";
		String lineas[];
		String errorDividir[] = null;
		Boolean encontrado=false;
		
		try {
			//execute the command and save the process in out
			Process out = builder.exec(comandoLinux);
			//take the result and print it on screen
			BufferedReader bf = new BufferedReader(new InputStreamReader(out.getInputStream()));
			String linea;
			while( (linea=bf.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (Exception ex) {
			lineas=ex.getMessage().split(" ");
			for(int i=0; i<lineas.length && encontrado==false;i++) {
				if(lineas[i].contains("error=")){
					errorDividir=lineas[i].split("="); 
					errorDividir=errorDividir[1].split(",");
				}
			}
			System.out.println("El valor del error es " +errorDividir[0]);
		}
	}

}