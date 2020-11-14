package Unidad1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {

	private static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String currentDir = System.getProperty("user.dir");
		mostrarContenidoCarpeta(currentDir);
       
		
	}
	

	private static void mostrarContenidoCarpeta (String nombreDirectorio) {

		File directorio = new File ( nombreDirectorio);
		File[] lista;
		ArrayList <String> listadoOrdenado= new ArrayList<String>();
		
	
		
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
				System.out.println(fichero);
			}
		}
	}

}
