package tableroDeAjedrez;

import java.util.Scanner;

public class Ajedrez {

	public static void main(String[] args) {
		Scanner ingreso = new Scanner (System.in);
		System.out.println("Ingresa un numero entero para el tablero de ajedrez");
		int n = ingreso.nextInt();
		ingreso.close();
		
		int j = 1;
		while (j <=n) {
			
			for (int i=1; i<=n; i++) {
				System.out.print("#"); i++;
				System.out.print(" ");
			}	
				System.out.println("");
				for(int k = 1; k<=n; k++) {
					System.out.print(" ");k++;
					System.out.print("#");
				}
			System.out.println("");
			j += 2;
		}

	}

}
