import java.util.LinkedList;
import java.util.Queue;

public class PlanificadorFCFS {
	private static Queue<ProcesoImpresion> queue;
	
	private void Planificador() {
		queue = new LinkedList<ProcesoImpresion>();
	}
	
	private void get() {
		ProcesoImpresion aux =queue.poll();
		long inicio, fin;
		try{
			if(aux!=null) {
			inicio= System.currentTimeMillis();
			System.out.println("Proces"+ aux.getNombre());
			System.out.println("Hora de salida" + inicio);
			Thread.sleep(aux.getDuracion());
			fin=System.currentTimeMillis();
			System.out.println("Hora fin" + fin);
			System.out.println("duracion del hilo " + aux.getDuracion() + " " + " ");
			}
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
