package Lista2;

import javax.swing.JOptionPane;

public class Exerc20 {

	public static void main(String[] args) {
		// Escrever um algoritmo que leia o nome de um vendedor, o seu sal�rio fixo
		// e o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que este
		// vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar ao final
		// do programa o seu nome, o sal�rio fixo e sal�rio no final do m�s. 
		
		String vendedor;
		double salarioFixo, vendas, salario;
		vendedor = JOptionPane.showInputDialog(null,"Informe o nome do vendedor: ");
		vendas = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe as vendas efetuadas no m�s: "));
		salarioFixo = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o valor do sal�rio fixo: "));
		
		salario = salarioFixo + 0.15 * vendas;
		
		JOptionPane.showMessageDialog(null,"O sal�rio no final do m�s � R$ "+salario+".");		
	}

}
