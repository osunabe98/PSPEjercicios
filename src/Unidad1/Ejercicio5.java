package Unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take the runtime of java application
				Runtime builder = Runtime.getRuntime();
				//execute commands line
				String comandoLinux="lss";
				String comandoWindows = "CMD /C DIRR";
				String lineas[];
				
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
					lineas=ex.getMessage().split(", ");
					System.out.println(lineas[1]);
				}
	}

}