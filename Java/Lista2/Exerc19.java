package Lista2;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		// Voc� ir� fazer uma viagem internacional e precisa levar seu dinheiro em d�lares.
		// Elabore um algoritmo para calcular e apresentar do valor da convers�o de real (R$)
		// para d�lar (US$). O algoritmo dever� solicitar o valor da cota��o do d�lar e
		// quantos Reais(R$) voc� tem para converter em d�lar. Ao final mostre a quantidade
		// de d�lares que voc� ir� levar para a viagem. 
		
		double cotacao, real, dolar;
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a cota��o do d�lar: ");
		cotacao = Double.parseDouble(scan.next());
		System.out.print("Informe o valor em reais (R$): ");
		real = Double.parseDouble(scan.next());
		
		dolar = real / cotacao;
		
		System.out.println("O valor em d�lares � US$ "+dolar+".");
	}

}
