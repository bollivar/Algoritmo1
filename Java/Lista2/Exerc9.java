package Lista2;

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		// Fa�a um programa que leia um n�mero e exiba seu sucessor.
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		num1 = Integer.parseInt(scan.next());
		num2=num1+1;
		System.out.println("O n�mero � " +num1+" e seu sucessor � " +num2 +".");

	}

}
