package Unidad2;

public class Pares extends Thread{
	 public synchronized void run(){
		 int n;
		 int contador=0;
		 for (n=1;n<=10;n++){ 
			 if (n % 2 == 0) {
			 System.out.print(" "+n+"\n");
			 contador=contador+n;
			 } 
		 }
		System.out.print("La suma de los pares es : "+contador + "\n");
		System.out.print(" ******************** \n");
		} 
}
