package br.com.generation.aula3;
import java.util.*;
public class Aula3Exssss; {

	public static void main(String[] args) {
		
		System.out.println("Olá, estes são os resultados da pesquisa de personalidade: ");
		
		Scanner scanner = new Scanner(System.in);
	    Random gerador = new Random(System.nanoTime());
	    int idade, sexo, nivelCalmo;
	    int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0,
	        nBCalmos = 0, pessoasNervMais40 = 0, pessoasCalMenos18 = 0;
	    int i = 0;

	    while (i < 150){

	      idade = gerador.nextInt(1, 120);
	      sexo = gerador.nextInt(1, 4);
	      nivelCalmo = gerador.nextInt(1, 4);

	      if (nivelCalmo == 1){
	        pessoasCalmas++;
	      }
	      if (sexo == 2 && nivelCalmo == 2){
	        mulheresNervosas++;
	      }
	      if (sexo == 1 && nivelCalmo == 3){
	        homensAgressivos++;
	      }
	      if (sexo == 3 && nivelCalmo == 1){
	        nBCalmos++;
	      }
	      if (idade > 40 && nivelCalmo == 2){
	        pessoasNervMais40++;
	      }
	      if (idade < 18 && nivelCalmo == 1){
	        pessoasCalMenos18++;
	      }
	      i++;
	    }

	    System.out.println("\nO total de pessoas que se declararam calmas é: " + pessoasCalmas);
	    System.out.println("O total de mulheres que se declararam nervosas é: " + mulheresNervosas);
	    System.out.println("O total de homens que se declararam agressivos é: " + homensAgressivos);
	    System.out.println("O total de pessoas não-binárias que se declararam calmas é: " + nBCalmos);
	    System.out.println("O total de pessoas menores de 18 anos que se declararam calmas é: " + pessoasCalMenos18);
	    System.out.println("O total de pessoas com mais de 40 anos que se declararam nervosas é : " + pessoasNervMais40);

	  }
	}


