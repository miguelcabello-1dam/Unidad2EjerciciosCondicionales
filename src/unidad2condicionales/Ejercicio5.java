package unidad2condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Determinar el precio de un billete de tren, conociendo la distancia a recorrer, y sabiendo que si el número de días de estancia es superior a 7 y la distancia superior a 800 km el billete tiene una reducción del 30%. El precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días de estancia los debes solicitar al usuario por teclado. 
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// constante donde se almacenan los dias minimos para que se aplique la rebaja como int
		final int DIAS_REBAJA = 7;
		// constante donde se almacenan los kilometros minimos para que se aplique la rebaja como int
		final int KM_REBAJA = 800;
		// constante donde se almacena el porcentaje de la rebaja como int
		final int REBAJA = 30;
		// constante donde se almacena el precio en euros por cada kilometro
		final double PRECIO_KM = 2.5;
		// variable donde se almacenan los kilometros como int
		int km;
		// variable donde se almacenan los dias como int
		int dias;
		// variable donde se almacena el precio del billete como int
		double precio;
		
		System.out.println("Cuantos kilometros vas a recorrer? ");
		km = sc.nextInt();
		
		System.out.println("De cuantos dias sera tu estancia? ");
		dias = sc.nextInt();
		
		precio = km * PRECIO_KM;
		
		if (dias > DIAS_REBAJA && km > KM_REBAJA) {
			precio = precio - precio * REBAJA / 100;
		}
		
		System.out.println("El precio del billete es de: " + precio + "€");
		
		// se cierra el scanner
		sc.close();

	}

}
