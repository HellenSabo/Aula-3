package br.com.generation.aula3;
import java.util.Scanner;
public class Aula3Exss {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá, vamos descobrir dentre dez números se eles são pares ou ímpares!");
		
		for (int i=1,num=0,par=0,impar=0; i<=10; i++) {
		
			System.out.println("Digite um número: ");
			num=leia.nextInt();
		    if(num %2 ==0){
			   par++;
			   System.out.println("Nesta rodada, você escolheu o número " + num + ", que é PAR!");
		    }
            if(num %2 >=1){
            	impar++;
            	System.out.println("Nesta rodada, você escolheu o número " + num + ", que é ÍMPAR!");
                          }
		
		
		System.out.println(par+" PAR(ES) x " +impar + " ÍMPAR(ES)");

	}

	}
	
}
