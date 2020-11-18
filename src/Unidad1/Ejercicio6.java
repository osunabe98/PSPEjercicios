package Unidad1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime builder = Runtime.getRuntime();
		//execute commands line
		String comandoLinux="ls";
		String comandoWindows = "CMD /C DIR";
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
			try (BufferedWriter filtroEscritura=new BufferedWriter(new FileWriter("log.txt"));) {
				filtroEscritura.write(lineas[1]);
				filtroEscritura.newLine();
			 } catch(IOException e) {
				 System.out.println(e.getMessage());
			}
			
		}
	}

}
