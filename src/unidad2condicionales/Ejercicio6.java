package unidad2condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Pedir al usuario el número de un mes y el año (comprobando si es o no bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el mes como int
		int mes;
		// variable donde se almacena el año como int
		int año;
		int dias;
		
		System.out.println("Introduce el mes: ");
		mes = sc.nextInt();
		
		System.out.println("Introduce el año: ");
		año = sc.nextInt();
		
		if (año % 4 == 0 && mes == 2) {
			dias = 31;
		} else {
			switch (mes) {
				case 1, 3, 5, 7, 8, 10, 12 -> { dias = 31; }
				case 2 -> { dias = 28; }
				default -> { dias = 30; }
			}
		}
		
		System.out.println("El mes tiene " + dias + " dias");
		
		// se cierra el scanner
		sc.close();

	}

}
