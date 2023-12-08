package ejercicio07;

// importación de paquetes necesarios
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticaEjercicio07 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Ejercicio 07 - Adivina un número entre 1 y 100");

		// Declaración de variables
		Random generador = new Random(); // Variable con Generador de números aleatorio
		int numAdivinar = generador.nextInt(100) + 1; // Variable almacenando un número aleatorio del 1 al 100
		int intento = 1; // Numero de intento actual
		int numeroSelect; // numero seleccionado para cada intento
		int resultado = 1; // variable para condicionar ejecución de prueba no superada
		int numintentos = 10; // variable declarando el numero de intentos
		Scanner lector = new Scanner(System.in);

		// Entrada y operaciones de condicion anidadas en bucle
		for (int i = 1; i <= numintentos; i++) { // Contabilización de intentos con la variable "i"
			System.out.print("Intento " + intento + " - Introduce un número (1-100): ");
			numeroSelect = lector.nextInt(); // conversión entrada en numero seleccionado
			intento++;

			// Condiciones de menor, mayor o igual con sus respectivas salidas
			if (numeroSelect < numAdivinar) {
				System.out.println("El número es mayor");
			} else if (numeroSelect > numAdivinar) {
				System.out.println("El número es menor");
			} else if (numeroSelect == numAdivinar) {
				System.out.println("Eres un crack!!! Lo has adivinado!!!");
				resultado = 0; // Evadir código de prueba no superada
				numintentos = 0; // Establecemos valor de numintentos a 0 para salir del bucle
			}
		}

		// Salida y Condición de prueba no superada
		if (resultado > 0) {
			System.out.println("Ohhhh, no lo has adivinado!!");
			System.out.println("Has superado el máximo de intentos.");
			System.out.println("El número era el " + numAdivinar);
		}

		lector.close();
	}

}
