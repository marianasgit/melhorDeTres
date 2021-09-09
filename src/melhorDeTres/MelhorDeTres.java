package melhorDeTres;

import java.util.Random;
import java.util.Scanner;

public class MelhorDeTres {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Random sorteio = new Random();
		
		int valorComputador = sorteio.nextInt(3) + 1;
		int valorJogador;
		int pedra = 1, papel = 2, tesoura = 3;
		int numeroPartidas, pontosJogador = 0, pontosPc = 0;
		int cont = 1;
		
		System.out.println("---------------------------");
		System.out.println("       J O K E N P O       ");
		System.out.println("---------------------------");
		
		System.out.print("Quantas partidas você deseja jogar (números ímpares acima de 3)? ");
		numeroPartidas = leitor.nextInt();
		
		System.out.println();
		
		if (numeroPartidas < 3 || numeroPartidas > 3 && numeroPartidas % 2 == 0) {
			System.out.println("Opção Inválida");
		}
		
		System.out.println("---------------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("---------------------------");
		System.out.println();
		
		
		while (cont <= numeroPartidas) {
			
			System.out.println("Partida " + cont);
			System.out.print("Qual a sua opção (1, 2 ou 3)? ");
			valorJogador = leitor.nextInt();
			
			String escolhaJogador, escolhaComputador;
			
			if (valorJogador == pedra) {
				escolhaJogador = "Pedra"; 
			} else if (valorJogador == papel) {
				escolhaJogador = "Papel";
			}else {
				escolhaJogador = "Tesoura";
			}
			
			if (valorComputador == pedra) {
				escolhaComputador = "Pedra";
			}else if (valorComputador == papel) {
				escolhaComputador = "Papel";
			}else {
				escolhaComputador = "Tesoura";
			}
			
			System.out.println();
			System.out.println("Você escolheu: " + escolhaJogador);
			System.out.println("Computador escolheu: " + escolhaComputador);
			System.out.println();
			
			if (valorJogador == pedra) {
				if (valorComputador == pedra) {
					System.out.println("Empate!");
				} else if (valorComputador == papel) {
					System.out.println("O computador venceu!");
				} else {
					System.out.println("Você venceu!");
				}
					
			} else if (valorJogador == papel) {
				if (valorComputador == papel) {
					System.out.println("Empate!");
				} else if (valorComputador == pedra) {
					System.out.println("Você venceu!");
				} else {
					System.out.println("O computador venceu!");
				}
			} else {
				if (valorComputador == tesoura) {
					System.out.println("Empate!");
				} else if (valorComputador == pedra) {
					System.out.println("O computador venceu!");
				} else {
					System.out.println("Você venceu!");
				}
			}
			
			System.out.println();
			
			cont++;
		}	
		
		
	}
		
}
