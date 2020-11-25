package Unidad1;

import java.io.IOException;

public class Ejercicio1v12 {

	public static void main(String[] args) {
		Runtime rt=Runtime.getRuntime();
		String comandoLinux="ls --help";
		String comandoWindows="CMD /C DIR";
		
		String comando=null;
	
		String os= args[0];
		
		if("W".contentEquals(os)) {
			comando=comandoWindows;
		}else {
			comando=comandoLinux;
		}
			
		Process p=null;
		try {
			p=rt.exec(comando);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
