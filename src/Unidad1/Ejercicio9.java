package Unidad1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejercicio9 {

	public static void main(String[] args) {
		ProcessBuilder peNV = new ProcessBuilder(); 
		Map <String, String> vbles = peNV.environment();
		System.out.println(vbles);
		escribirFichero(vbles);
		
		
		List<String> lComand = new ArrayList <String>();
		lComand.add("CMD");
		lComand.add("/C");
		lComand.add("DIRR");
		
		ProcessBuilder pb = new ProcessBuilder(lComand); 
		System.out.println(pb.command());
		try {
			 pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void escribirFichero(Map lista) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("salida_ejercicio9.txt");
            pw = new PrintWriter(fichero);

            pw.write(lista.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
	public static void escribirFicheroLog(List lista) {
		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("log_ejercicio9.txt");
            pw = new PrintWriter(fichero);

            pw.write(lista.toString());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}

}
