package unidad2condicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Implementar un programa que pida por teclado un número decimal e indique si es un número casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero. Es decir, un número casi-cero es el que se encuentra en el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el numero como int
		int num;
		
		// se pide que se introduzca el numero
		System.out.println("Introduce numero entre 0 y 9999");
		// se guarda en la variable num
		num = sc.nextInt();
		
		// Si el numero es de 1 cifra
		if (num >= 0 && num < 10) {
			// El numero es capicua
			System.out.println("El numero es capicua");
		// Si el numero tiene dos cifras
		} else if (num >= 10 && num < 100) {
			// Si la primera cifra es igual a la segunda
			if (num / 10 == num % 10) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		} else if (num >= 100 && num < 1000) {
			if (num / 100 == num % 10) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		} else if (num >= 1000 && num < 10000) {
			if (num / 1000 == num % 10 && (num / 100) % 10 == (num / 10) % 10) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		} else {
			System.out.println("Fuera de rango");
		}
		
		// se cierra el scanner
		sc.close();

	}

}
