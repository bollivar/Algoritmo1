package Lista2;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		// Muitos pa�ses est�o passando a usar o sistema m�trico.
		// Preparar um algoritmo para executar a convers�o de 
		// Celsius para Fahrenheit.
		
		float C,F;
		Scanner scan  = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius: ");
		C = Float.parseFloat(scan.next());
		
		F = (9*C+160) / 5;
		
		System.out.println("A temperatura em Fahrenheit � "+F+".");

	}

}
