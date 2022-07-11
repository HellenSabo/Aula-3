package br.com.generation.aula3;

public class Aula3Exs {

	public static void main(String[] args) {
		
		System.out.println("Vamos descobrir quais são os números de 1000 a 1999 que, ao serem divididos por 11, têm como resto da divisão  5: ");	
		for(int i=1000;i<=1999;i++){
			
			
			if (i%11==5){
				
				System.out.println(i);
			}
			
		}
		System.out.println("Acabou! Pode ir tomar café!");
	}

}
