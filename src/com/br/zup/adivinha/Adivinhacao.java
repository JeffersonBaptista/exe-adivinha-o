package com.br.zup.adivinha;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {
		
		System.out.println("Este prograna foi desenvolviso para Você testar sua sorte. \n"
				+ "O usuario devera digita um numero inteiro entre 0 - 50.\n"
				+ "O sistema fara um sorteio e caso o numero sortiado seja igual ao digitado você ganha.\n"
				+ "Você tera 10 tentadivas de acerto.\n"
				+ "------------------------------------------------------------------------------------\n"
				+ "Deseja teste sua sorte?\n"
				+ "Digite *S* para sim ou *N* para não. BOA SORTE...");
		
		Scanner scan = new Scanner(System.in);
		String primeiraVerificacao = scan.next();
		
		
		if(primeiraVerificacao.equalsIgnoreCase("S")) {
			int vida;
			
			//int contVida =10;
			
			for (vida = 10; vida > 0 ; vida--) {
				
				
				
				System.out.println("Voçê tem: "+  vida + "\n ------------------------------------------");
				
				System.out.println("Didite um numero para teste a sorte \n");
				int numeroUsuario = scan.nextInt();
				
				Random sorteio = new Random();
				int numeroSorteio = sorteio.nextInt(50); 
				

				if(numeroUsuario == numeroSorteio) {
					
					System.out.println("....PARABÉNS VC GANHOU....");
					vida = -1;
					
					
				}else if (vida == 1) {
					System.out.println("Suas vidas acabaram...");
					
				}else if(vida != 0){
					System.out.println("Não foi desta vez, tente novamente.");
				}
			
				System.out.println("\n -------------------Resultado---------------------");
				System.out.println("-------------------------------------------------");
				System.out.println("numero sortiado: "+numeroSorteio);
				System.out.println("");
				
				System.out.println("numero jogado: "+ numeroUsuario);
				System.out.println("------------------------------------------------- \n");
				
					
		
					
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}else {
			
		}
		
		
		

	}

}
