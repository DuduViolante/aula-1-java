package exercicio1;

import java.util.Scanner;

public class exercicios3 {
	public static void main (String[] args){
		String nome = "";		
		double nota1 = 0.0;
		double nota2 = 0.0;
		double result = 0.0;

		Scanner entrada = new Scanner (System.in);

		System.out.println("informe seu nome: ");
		nome = entrada.nextLine();
		System.out.println("informe o valor da nota 1: ");
		nota1 = entrada.nextInt();
		System.out.println("informe o valor da nota 2: ");
		nota2 = entrada.nextInt();

		result = (nota1/nota2);

		System.out.println("Ola"+nome+ "o resultado é: "+result);
			}
		}
