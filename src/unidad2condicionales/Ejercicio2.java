package unidad2condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Utiliza un operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el numero como int
		int num;
		
		// variable donde se almacena el valor absoluto como int
		int valorAbsoluto;
		
		// se pide que se introduzca el numero
		System.out.println("Introduce numero: ");
		// se guarda en la variable num
		num = sc.nextInt();
		
		// si el numero es positivo el valor absoluto es el numero, si no es el numero pasado a positivo
		valorAbsoluto = num >= 0 ? num : -num;
		
		// se devuelve el valor absoluto
		System.out.println("El valor absoluto es " + valorAbsoluto);
		
		// se cierra el scanner
		sc.close();

	}

}
