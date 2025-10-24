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
		
		/*System.out.println("Cuantos kilometros vas a recorrer? ");
		km = sc.nextInt();
		
		System.out.println("De cuantos dias sera tu estancia? ");
		dias = sc.nextInt();
		
		precio = km * PRECIO_KM;
		
		if (dias > DIAS_REBAJA && km > KM_REBAJA) {
			precio = precio - precio * REBAJA / 100;
		}
		
		System.out.println("El precio del billete es de: " + precio + "€");*/
		
		// se cierra el scanner
		sc.close();

	}

}
