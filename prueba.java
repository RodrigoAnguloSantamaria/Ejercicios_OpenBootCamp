

package project1;
import java.util.Scanner;


public class prueba {
	
	public static void main(String[] args){
		
		Scanner Escanear = new Scanner(System.in);
		System.out.print("Introduce el primer numero:");
		int num1 = Escanear.nextInt();
		System.out.print("Introduce el segundo numero:");
		int num2 = Escanear.nextInt();
		System.out.print("Introduce el tercer numero:");
		int num3 = Escanear.nextInt();
		
		int valor = suma(num1, num2, num3);
		System.out.println("La funcion suma devuelve: " + valor);
		Coche MiCoche = new Coche();
		MiCoche.MasPuertas();
		
		System.out.println("Puertas de Coche: " + MiCoche.puertas);
		
	}
	 
	public static int suma(int num1,int num2,int num3) {
		
		return num1+num2+num3;
	}
}
	class Coche{
		public int puertas=0;
		public void MasPuertas() {
			this.puertas++;
		}
	}

