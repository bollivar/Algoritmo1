package Lista2;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		// Fa�a um programa para ler dois n�meros inteiros,
		// e apresente o quociente e o resto da divis�o entre eles.
		int num1,num2,quoc, resto;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro (dividendo): ");
		num1 = Integer.parseInt(scan.next());
		System.out.print("Digite outro n�mero inteiro (divisor): ");
		num2 = Integer.parseInt(scan.next());
		
		quoc = num1 / num2;
		resto = num1 % num2;
		
		System.out.println("O quociente da divis�o entre " +num1+ " e " + num2+ " � " +quoc + " e o resto � " +resto+".");	
		

	}

}
