package Lista2;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		// Fa�a um programa para simular o pagamento em um caixa de supermercado.
		// O usu�rio dever� informar o pre�o do produto e depois o valor pago pelo
		// cliente (este valor dever� ser igual ou maior que o pre�o do produto). 
		// Ao final, mostre o valor do troco a ser retornado para o cliente.
		
		float preco, pagamento, troco;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o pre�o do produto: ");
		preco = Float.parseFloat(scan.next());
		System.out.print("Informe o valor pago pelo cliente: ");
		pagamento = Float.parseFloat(scan.next());
		
		troco = pagamento - preco;
		
		if (pagamento < preco) {
			System.out.println("O cliente deve R$ "+(troco*(-1))+".");
		}else{
			System.out.println("O troco �: R$ "+troco+".");
		}

	}

}
