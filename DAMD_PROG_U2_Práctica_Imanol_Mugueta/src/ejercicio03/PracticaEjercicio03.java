package ejercicio03;

import javax.swing.JOptionPane;

public class PracticaEjercicio03 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Ejercicio 03 - Múltiplos de 2 y 3 (while)");

		// Declaración variables

		int numero = 1;
		int contador = 0;

		// Operación y salida

		while (numero >= 1 && numero <= 100) { // Condicion de entrada al bloque while
			if (numero % 2 == 0 && numero % 3 == 0) { // Condicion de entrada al bloque if
				System.out.println("");
				System.out.println("Multiplo de 2 y 3: " + numero); // Salida
				contador++;

			}

			numero++; // Incremento (+1) del valor de la variable numero
		}
		System.out.println("");
		System.out.println("Total de multiplos de 2 y 3: " + contador);
	}
}
