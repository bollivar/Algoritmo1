package Lista2;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		// Escreva um algoritmo para determinar o consumo m�dio
		// de um autom�vel sendo que ser� fornecida via teclado
		// a dist�ncia total percorrida pelo autom�vel e o total
		// de combust�vel gasto. 
		float dist, comb, consumo;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a dist�ncia total percorrida (em quil�metros): ");
		dist = Float.parseFloat(scan.next());
		System.out.print("Informe o total de combust�vel gasto (em litros): ");
		comb = Float.parseFloat(scan.next());
		
		consumo = dist / comb;
		
		System.out.println("O consumo m�dio do autom�vel � de: "+consumo+ " km/l.");
		

	}

}
