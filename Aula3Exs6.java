package br.com.generation.aula3;
import java.util.Scanner;
public class Exssssss {

	public static void main(String[] args) {

			int result = 0, soma = 0, i = 0;
			Scanner leia = new Scanner(System.in);

			do {
				 System.out.println("Digite um número para ser incluído à soma ou zero (0) para sair do programa: ");
				 result = leia.nextInt();
				 if(result % 3 == 0) {
				 soma = result + soma;
				 i++;
				            }
			}while(result !=0);
			i--;
			System.out.println("A média dos numeros multiplos de 3 é: " + soma/i);
	
	}}