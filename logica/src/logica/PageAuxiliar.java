package logica;

import java.util.Scanner;

public class PageAuxiliar {

	public double salarioComDesconto(double salario, double porcentagem) {
		double resultado = salario - ((salario * porcentagem) / 100);
		return resultado;
	}
	
	public double valorDoDesconto(double salario, double porcentagem) {
		double resultado = salario * ((porcentagem / 100));
		return resultado;
		
	}
	
	public void maiorIdade(int idade) {
		if (idade>=18) {
			System.out.println("Maior idade (+ 18)");
		}
		else {
			System.out.println("Menor idade (- 18)");
		}
	}

	public void valorParcialDoSalario(double x) {
		String percent = "";
		if(x > 4500) {
			x = x * 0.3;
			percent ="30%";
		}
		else {
			x = x * 0.15;
			percent ="15%";
		}
		System.out.println("Total de " + percent + " do salário é R$" + x );
	} 	
	
	public void imparPar(double x) {
		double divisao = x % 2;
		if (divisao != 0) {
			System.out.println("Número IMPAR!");
		}
			else {
				System.out.println("Número PAR!");
			}
		}
	
	public void inserirNome(String x) {
		if (x.equalsIgnoreCase("admin")  || x.equalsIgnoreCase("administrador") || x.equalsIgnoreCase("")) {
			System.out.println("Login inválido. Favor preencher com algo diferente de " + "'" + x + "'!");
		}
		else {
			System.out.println("Usuário " + "'" + x + "'" + " cadastrado com sucesso!");
		}
	}
	
	/********Aula 23*********/
	public void alistamento(String sexo,int idade) {
		if(sexo == "M" && idade < 18) {
			System.out.println("Alistamento não permitido!");
		}
		else if(sexo == "F" && idade >= 18) {
			System.out.println("Deseja alistamento?");
		}
		else if(sexo == "F" && idade < 18) {
			System.out.println("Alistamento não permitido!");
		}
		else {
			System.out.println("Alistamento obrigatório!");
		}
	}
	
	//Aula 34//
	public void taboada(int x) {
		for(int i = 1; i <= 10; i++) {
			System.out.print(x*i + " ");
		}
	}
	
	
	public void taboadaTotal() {
		for(int i = 1; i <= 10; i++) {
			
			for(int a = 1; a <= 10; a++ ) {
				System.out.print(i * a + " ");
			}
		System.out.println("");}
	}
	
	//Aula 39
	public void mutiplicaçãoEntreArrays() {
		int[] array1 = new int[3];
		int[] array2 = new int[3];
		int[] array3 = new int[3];
		Scanner scanner = new Scanner(System.in);
		String resultadoMutiplicacao = " ";
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("vetor 1, posição: " + i);
			array1[i] = scanner.nextInt();
			System.out.println("vetor 2, posição: " + i);
			array2[i] = scanner.nextInt();
			array3[i] = array1[i] * array2[i];
			resultadoMutiplicacao = resultadoMutiplicacao + array3[i] + " ";
		}
		System.out.println(resultadoMutiplicacao);
	}
	
	
}
