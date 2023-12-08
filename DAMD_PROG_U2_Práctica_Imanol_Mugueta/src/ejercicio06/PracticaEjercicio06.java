package ejercicio06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticaEjercicio06 {

	public static void main(String[] args) {

		// Panel de información sobre como realizar la operación

		JOptionPane.showMessageDialog(null, "Ejercicio 06 - Mayor, menor y valor medio de los pares)");

		// Declaración variables

		Scanner lector = new Scanner(System.in);
		int numero;

		int promedio;
		int sumaPar = 0;
		int contadorPar = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		// Entrada y conversión

		System.out.print("Introduce la cantidad de números: ");
		int cantidad = lector.nextInt();

		// Operaciones para determinar max, min, y media de pares

		for (int i = 0; i < cantidad; i++) { // Inicialización de bucle hasta que i iguale a cantidad
			System.out.print("Introduce un número: ");
			numero = lector.nextInt();

			if (numero % 2 == 0) { // Condicion si es par
				sumaPar = sumaPar + numero;
				contadorPar++;
			}
			if (numero > max) { // condicion si el numero es mayor que el valor de max
				max = numero;
			}
			if (numero < min) { // Condición si el numero es menor que el valor de min
				min = numero;
			}
		}

		// Salida

		System.out.println("El mayor es: " + max);
		System.out.println("El menor es: " + min);

		if (contadorPar > 0) { // Condición si hay numeros pares
			promedio = sumaPar / 2;

			System.out.println("El valor medio es: " + promedio);
		} else {
			System.out.println("No hay ningún número Par");
		}

		lector.close();

	}

}
