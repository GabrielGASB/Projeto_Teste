package logica;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PageAuxiliar pessoa1 = new PageAuxiliar();
		
		/*******Calculo de imposto*******/
		double salario = 1500; 
		double desconto = 10;
						
		double salarioFinal = pessoa1.salarioComDesconto(salario, desconto);
		double valorDesconto = pessoa1.valorDoDesconto(salario, desconto);
		
		System.out.println("Valor do sálário: R$" + salario);
		System.out.println("Percentual do desconto: " + desconto + "%");
		System.out.println("Valor a ser descontado: R$" + valorDesconto);
		System.out.println("Salario do salário com desconto: R$" + salarioFinal);
		
		/********Maior Idade*******/
		int idade = 18;
		pessoa1.maiorIdade(idade);
		System.out.println("Idade digitada: " + idade);
		
		/********Valor de parte do salario******/
		double salario2 = 4700;
		pessoa1.valorParcialDoSalario(salario2);
		
		/********Se numero impar ou par********/
		double numero = 3;
		pessoa1.imparPar(numero);
		
		/********Cadastro de login*********/
		String nome = "ADMIN";
		pessoa1.inserirNome(nome);
		
		/********Alistamento**************/
		String sexo = "M";
		pessoa1.alistamento(sexo, idade);
	
		/********Taboada******************/
//		pessoa1.taboada(2);
		

		/***Taboada automatica de 1 a 10***/
//		pessoa1.taboadaTotal();
		
	
		pessoa1.mutiplicaçãoEntreArrays();
	}

}
