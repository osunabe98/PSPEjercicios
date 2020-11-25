package Unidad1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejercicio8 {

	public static void main(String[] args) {
		ProcessBuilder peNV = new ProcessBuilder(); 
		Map <String, String> vbles = peNV.environment();
		System.out.println(vbles);
		
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

}
