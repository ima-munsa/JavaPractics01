package ejercicio08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PracticaEjercicio08 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Ejercicio 08 - Tabla de multiplicar");
		
		// Declaración variables

		int numero;
		int multiplicador = 1;
		Scanner lector = new Scanner(System.in);

		// Entrada y conversión

		System.out.print("Introduce un número: ");
		numero = lector.nextInt();
		System.out.println("Tabla de multiplicar del " + numero);

		// Operacion y salida
		for (int i = 1; i <= 10; i++) {

			System.out.println(numero + " * " + multiplicador + " = " + numero * multiplicador);
			multiplicador++;
		}

		lector.close();
	}

}
