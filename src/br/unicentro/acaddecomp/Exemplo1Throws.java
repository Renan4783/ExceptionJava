package br.unicentro.acaddecomp;

import java.util.*;

public class Exemplo1Throws {
	public static int quociente(int numerador, int denominador) throws ArithmeticException {
		return numerador/denominador;
	}
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		boolean continuaLoop = true;
		int numerador, denominador, resultado;
		do {
			try {
				System.out.println("Entre com um numerador inteiro: ");
				numerador = scanner.nextInt();
				System.out.println("Entre com um denominador inteiro: ");
				denominador = scanner.nextInt();
				resultado = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
				continuaLoop = false;
			} catch (ArithmeticException arithmeticException) {
				System.out.printf("\nException: %s", arithmeticException);
				System.out.println("\nZero � um denominador inv�lido! Por favor, digite novamente!");
				System.out.println();
			} catch (InputMismatchException inputMismatchException){
				System.out.printf("\nException: %s", inputMismatchException);
				System.out.println("\n� necess�rio um n�mero inteiro!\n");
				scanner.nextLine();
			}
		} while (continuaLoop);
	}
}
