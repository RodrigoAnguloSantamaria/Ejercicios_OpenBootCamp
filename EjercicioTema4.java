import java.util.Scanner;

public class EjercicioTema4 {

	public static void main(String[] args) {
		Scanner Escanear = new Scanner(System.in);
		System.out.print("Introduce un numeroIf:");
		int numeroIf = Escanear.nextInt();
		if (numeroIf > 0){
			System.out.println("NumeroIf positivo");
		}
		else if (numeroIf < 0){
			System.out.println("NumeroIf negativo");
		}
		else {
			System.out.println("NumeroIf es 0");
		}
		
		System.out.print("Introduce el numeroWhile (tiene que ser inferior a 3):");
		int numeroWhile = Escanear.nextInt();
		while (numeroWhile <= 3) {
			System.out.println("Valor de numeroWhile:" + numeroWhile);
			numeroWhile++;
		}
		
		System.out.print("Introduce el numeroDoWhile (tiene que ser inferior a 3):");
		int numeroDoWhile = Escanear.nextInt();
		do {
			System.out.println("Valor de numeroDoWhile:" + numeroDoWhile);
			numeroDoWhile=3;
			System.out.println("Nuevo valor de numeroDoWhile:" + numeroDoWhile);
			
		}
		while (numeroDoWhile != 3);
		
		
		for (int numeroFor=0; numeroFor <=3; numeroFor++){
			System.out.println("Valor de numeroFor:" + numeroFor);
		}
		
		
		System.out.println("1. Primavera");
		System.out.println("2. Verano");
		System.out.println("3. Otoño");
		System.out.println("4. Invierno");
		System.out.println("Elige una estacion:");
		int Estacion = Escanear.nextInt();
		switch (Estacion) {
			case 1:
				System.out.println("Has elegido Primavera");
				break;
			case 2:
				System.out.println("Has elegido Verano");
				break;
			case 3:
				System.out.println("Has elegido Otoño");
				break;
			case 4:
				System.out.println("Has elegido Invierno");
				break;
			default:
				System.out.println("La opcion elegida no corresponde con ninguna estacion.");
				
		}
		
		Escanear.close();
	}

}
