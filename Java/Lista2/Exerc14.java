package Lista2;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		// Fa�a um algoritmo onde dever� ser informado a base
		// e a altura de um tri�ngulo. O algoritmo dever� exibir
		// o valor da �rea.
		
		float base, altura, area;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a base do tri�ngulo: ");
		base = Float.parseFloat(scan.next());
		System.out.print("Informe a altura do tri�ngulo: ");
		altura = Float.parseFloat(scan.next());
		
		area = (base * altura)/2;
		
		System.out.println("A �rea do tri�ngulo � "+area +".");	

	}

}
