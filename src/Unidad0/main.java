package Unidad0;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;


public class main {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
       preparaMicroprocesador();
       PlanificadorFCFS.sirve();
       */
    	//Cambio 
    	preparaMicroprocesadorSTF();
        PlanificadorSSTF.sirve();
    } 
    
    public static void preparaMicroprocesadorFCFS(){
        ArrayList<Proceso> procesos = new ArrayList<Proceso>();
        
        for (int i=1; i<=5; i++){
        	Proceso pi = new Proceso("P_" + i, ((int) Math.floor(Math.random()*4+1)) * 1000);
            procesos.add(pi);
        }
        
        Collections.shuffle(procesos);
        
        for(Proceso p : procesos){
             PlanificadorFCFS.put(p);               
        } 
    }
    
    private static void preparaMicroprocesadorSTF () {
		for (int i = 1; i <= 5; i++) {
			Proceso pi = new Proceso( "p" + i, ((int) Math.floor(Math.random()*4+1)) * 1000 );
			PlanificadorSSTF.put(pi);
		}
		
		Collections.sort(PlanificadorSSTF.procesos, new Comparator<Proceso>() {
			@Override
			public int compare(Proceso p1, Proceso p2) {
				return p1.duracion - p2.duracion;
			} });
	}
}