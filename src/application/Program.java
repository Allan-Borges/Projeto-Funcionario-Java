package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
				
		System.out.print("Qual � o seu nome? ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Qual o valor do sal�rio bruto? ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Qual o valor do imposto? ");
		funcionario.taxa = sc.nextDouble();
		
		funcionario.salarioLiquido();
		
		System.out.println(funcionario.name + " O valor do seu sal�rio liqu�do � de R$" + funcionario.salarioLiquido());
		System.out.println();
		
		System.out.print("Qual o valor  do aumento em %? ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentoSalario(porcentagem);
		
		System.out.println(funcionario);
		sc.close();
	}

}
