package br.com.generation.aula3;
import java.util.Scanner;
public class Aula3Exsss {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		int i=0;
		
		int idade21=0, idade50=0, idadeInter=0, idade;
		while(i<100) {
			i++;
			System.out.println("Insira numericamente a idade a ser incluída no cálculo: ");
			idade= leia.nextInt();
			if(idade>99) {
				System.out.println("Este valor é inválido e o programa precisou encerrar com os dados válidos inseridos até então.");
				break;}
			if(idade>50 && idade<=99){
				idade50++;
			}
			if(idade<21){
				idade21++;
			}
			if(idade>=21 && idade<=50){
				idadeInter++;
			}		
		}
		System.out.println("\nResultado: \n-O total de pessoas cadastradas até 20 anos é: "+idade21);
		System.out.println("\n-O total de pessoas cadastradas entre 21 anos e 50 anos é: " + idadeInter);
		System.out.println("\n-O total de pessoas cadastradas com mais de 50 anos é: " + idade50);
	}

	

}
