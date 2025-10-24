package unidad2condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde. Observa que un número de 8 dígitos está dentro del rango del tipo int.
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el dni como int
		int dni;
		
		// variable donde se almacena el la letra como char
		char letra;
		
		// se pide que se introduzca el dni
		System.out.println("Introduce DNI: ");
		// se guarda en la variable dni
		dni = sc.nextInt();
		
		// se comparan todos los casos para seleccionar la letra correspondiente
		switch(dni%23) {
		case 0 -> letra = 'T';
		case 1 -> letra = 'R';
		case 2 -> letra = 'W';
		case 3 -> letra = 'A';
		case 4 -> letra = 'G';
		case 5 -> letra = 'M';
		case 6 -> letra = 'Y';
		case 7 -> letra = 'F';
		case 8 -> letra = 'P';
		case 9 -> letra = 'D';
		case 10 -> letra = 'X';
		case 11 -> letra = 'B';
		case 12 -> letra = 'N';
		case 13 -> letra = 'J';
		case 14 -> letra = 'Z';
		case 15 -> letra = 'S';
		case 16 -> letra = 'Q'; 
		case 17 -> letra = 'V';
		case 18 -> letra = 'H';
		case 19 -> letra = 'L';
		case 20 -> letra = 'C';
		case 21 -> letra = 'R';
		default -> letra = 'E';
		}
		
		// se devuelve la letra
		System.out.println("El DNI completo es: " + dni + letra);
		
		// se cierra el scanner
		sc.close();

	}

}
