package Lista2;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		// Leia dois valores para as vari�veis A e B, 
		// efetuar a troca dos valores de forma que a vari�vel A
		// passe a possuir o valor da vari�vel B, e que a
		// vari�vel B passe a possuir o valor da vari�vel A. 
		// Apresentar os valores trocados pelas vari�veis.
		
		String A,B,AUX;
				
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor de A: " );
		A = scan.next();
		System.out.print("Digite o valor de B: " );
		B = scan.next();
		
		AUX = A;
		A = B;
		B = AUX;
				
		System.out.println("O valor de A agora � "+A+ " e o de B agora � "+B+".");	

	}

}
