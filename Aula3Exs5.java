package br.com.generation.aula3;
import java.util.*;
public class Aula3Exsssss {

	public static void main(String[] args) {
		
		System.out.println("Olá, vamos listar números internamente até encontrar um zero, e depois vamos somar os anteriores!");
		 Scanner scanner = new Scanner(System.in);
		    Random gerador = new Random(System.nanoTime());
		    int num = 0, somaNum = 0;

		    do {
		  
		      num = gerador.nextInt(0, 120);
		      somaNum += num;
		    }while (num != 0);

		    System.out.println("A soma de números nesta rodada foi: " + somaNum);

		  }

	}


