package Lista2;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		// Construir um algoritmo para ler 5 valores inteiros, calcular e
		// imprimir a soma desses valores. 
		
		int num1, num2, num3, num4, num5, soma;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero inteiro: ");		
		num1 = Integer.parseInt(scan.next());
		
		System.out.print("Digite o segundo n�mero inteiro: ");
		num2 = Integer.parseInt(scan.next());
		
		System.out.print("Digite o terceiro n�mero inteiro: ");
		num3 = Integer.parseInt(scan.next());
		
		System.out.print("Digite o quarto n�mero inteiro: ");
		num4 = Integer.parseInt(scan.next());
		
		System.out.print("Digite o quinto n�mero inteiro: ");
		num5 = Integer.parseInt(scan.next());
		
		soma = num1 + num2 + num3 + num4 + num5;
		
		System.out.println("A soma dos valores digitados � " + soma + ".");
		

	}

}
