package Unidad1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String currentDir = System.getProperty("user.dir");
		mostrarContenidoCarpeta(currentDir);
		
		
		
	}

	private static void mostrarContenidoCarpeta (String nombreDirectorio) {

		File directorio = new File ( nombreDirectorio);
		File[] lista;
		ArrayList <String> listadoOrdenado= new ArrayList<String>();
		String nombre= "fichero.txt";
	
		
		if ( !directorio.isDirectory()) {
			System.out.println("No es una carpeta");
		}
		else {
			lista= directorio.listFiles();
			for (File file : lista) {
				if (file.isFile()) {
					listadoOrdenado.add(file.getName());
				}
			}
			Collections.sort(listadoOrdenado);
			
			for ( String fichero: listadoOrdenado) {
				try (BufferedWriter filtroEscritura=new BufferedWriter(new FileWriter(nombre));) {
					filtroEscritura.write(fichero);
					filtroEscritura.newLine();
				 } catch(IOException e) {
					 System.out.println(e.getMessage());
				}
			}
		}
	}


}
