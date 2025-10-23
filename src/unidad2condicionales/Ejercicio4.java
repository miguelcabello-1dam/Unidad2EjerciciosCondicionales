package unidad2condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. La aplicación le pedirá al usuario que introduzca el resultado de la suma. La aplicación le indicará si el resultado es correcto o no.
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el numero como int
		Random aleatorio = new Random();
		
		// variable donde se almacena el primer numero aleatorio como int
		int num1 = aleatorio.nextInt(1, 99);
		// variable donde se almacena el segundo numero aleatorio como int
		int num2 = aleatorio.nextInt(1, 99);
		// variable donde se almacena la respuesta del usuario como int
		int respuesta;
		// variable donde se almacena el resultado, si es correcto o no
		String solucion;
		
		// se pide que se introduzca respuesta a la suma
		System.out.println("Cuanto es " + num1 + " + " + num2 + "? ");
		// se guarda en la variable respuesta
		respuesta = sc.nextInt();
		
		// 
		solucion = respuesta == num1 + num2 ? "correcta" : "incorrecta";
		
		// se devuelve el resultado
		System.out.println("La solucion a " + num1 + " + " + num2 + " es: " + (num1+num2) + "; tu respuesta es " + solucion);
		
		// se cierra el scanner
		sc.close();

	}

}
