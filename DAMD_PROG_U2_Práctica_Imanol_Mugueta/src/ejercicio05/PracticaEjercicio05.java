package ejercicio05;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticaEjercicio05 {

	public static void main(String[] args) {

		
		JOptionPane.showMessageDialog(null, "Ejercicio 05 - Pares, impares, positivos y negativos (for)");
		
		// Declaración variable
		Scanner lector = new Scanner(System.in);
		int numero = 0;
		int contadorPar = 0;
		int contadorImpar = 0;
		int contadorPositivo = 0;
		int contadorNegativo = 0;
		int pos = 0;

		// Operación bucle for

		for (int i = 1; i <= 10; i++) {
			pos++;
			System.out.print("introduce el numero " + pos + ": ");
			numero = lector.nextInt();
			if (numero % 2 == 0 && numero >= 0) { // Si es par y positivo
				contadorPar++;
				contadorPositivo++;
			} else if (numero % 2 == 0 && numero < 0) { // Si es par y negativo
				contadorPar++;
				contadorNegativo++;
			} else if (numero % 2 != 0 && numero >= 0) { // Si es impar y positivo
				contadorImpar++;
				contadorPositivo++;
			} else if (numero % 2 != 0 && numero < 0) { // Si es impar y negativo
				contadorImpar++;
				contadorNegativo++;
			}
		}

		// Salida
		System.out.println("Pares: " + contadorPar);
		System.out.println("Impares: " + contadorImpar);
		System.out.println("Positivos: " + contadorPositivo);
		System.out.println("Negativos: " + contadorNegativo);

		lector.close();

	}

}
