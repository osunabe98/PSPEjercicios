package Unidad2;

public class Ejercicio2_1 extends Thread{
	
	public void run() {
		pruebaTic();
		pruebaToc();
	}
	public void pruebaTic() {
		
			try {
				while(true){
					System.out.println("Tic....");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public void pruebaToc() {
		try {
			while(true){
				System.out.println("TIC");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
