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
		String resposta = "S";
		
		while (resposta.equals("S")) {
		
			System.out.println("---------------------------");
			System.out.println("       J O K E N P O       ");
			System.out.println("---------------------------");
		
			System.out.print("Quantas partidas você deseja jogar (números ímpares acima de 3): ");
			numeroPartidas = leitor.nextInt();
			
			System.out.println();
			
			while (true) {
			
				if ( numeroPartidas < 3 || numeroPartidas % 2 == 0) {
					System.out.print("Opção Inválida. Escolha novamente: ");
					numeroPartidas = leitor.nextInt();
				} else {
					break;
				}
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
						pontosPc += 1;
					} else {
						System.out.println("Você venceu!");
						pontosJogador += 1;
					}
						
				} else if (valorJogador == papel) {
					if (valorComputador == papel) {
						System.out.println("Empate!");
					} else if (valorComputador == pedra) {
						System.out.println("Você venceu!");
						pontosJogador += 1;
					} else {
						System.out.println("O computador venceu!");
						pontosPc += 1;
					}
				} else {
					if (valorComputador == tesoura) {
						System.out.println("Empate!");
					} else if (valorComputador == pedra) {
						System.out.println("O computador venceu!");
						pontosPc += 1;
					} else {
						System.out.println("Você venceu!");
						pontosJogador += 1;
					}
				}
				
				System.out.println();
				
				valorComputador = sorteio.nextInt(3) + 1;
				
				double melhorDe = (numeroPartidas / 2) + 1;
				
				if (melhorDe == pontosPc) {
					break;
				}
				
				if (melhorDe == pontosJogador) {
					break;
				} 
				
				cont++;
			}	
			
			while (pontosJogador == pontosPc) {
				
				System.out.println("PARTIDA DE OURO");
				System.out.println();
				
				
				System.out.print("Qual a sua opção (1, 2 ou 3)? ");
				valorJogador = leitor.nextInt();
				
				String escolhaJogador, escolhaComputador;
				
				if (valorJogador == pedra) {
					escolhaJogador = "Pedra"; 
				} else if (valorJogador == papel) {
					escolhaJogador = "Papel";
				} else {
					escolhaJogador = "Tesoura";
				}
				
				if (valorComputador == pedra) {
					escolhaComputador = "Pedra";
				} else if (valorComputador == papel) {
					escolhaComputador = "Papel";
				} else {
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
						pontosPc += 1;
					} else {
						System.out.println("Você venceu!");
						pontosJogador += 1;
					}
						
				} else if (valorJogador == papel) {
					if (valorComputador == papel) {
						System.out.println("Empate!");
					} else if (valorComputador == pedra) {
						System.out.println("Você venceu!");
						pontosJogador += 1;
					} else {
						System.out.println("O computador venceu!");
						pontosPc += 1;
					}
				} else {
					if (valorComputador == tesoura) {
						System.out.println("Empate!");
					} else if (valorComputador == pedra) {
						System.out.println("O computador venceu!");
						pontosPc += 1;
					} else {
						System.out.println("Você venceu!");
						pontosJogador += 1;
					}
				}
			}
			
			System.out.println();
			
			if (pontosJogador > pontosPc) {
				System.out.println("VOCÊ VENCEU DESAFIO POR " + pontosJogador + " X " + pontosPc);
			} 
			
			if (pontosPc > pontosJogador) {
				System.out.println("COMPUTADOR VENCEU O DESAFIO POR " + pontosPc + " X " + pontosJogador);
				
			}
			
			System.out.println();
			
			System.out.print("Jogar novamente (S/N)? ");
			resposta = leitor.next();
			
			System.out.println();
			
			cont = 1;
			pontosJogador = 0;
			pontosPc = 0;
		
		}
	}
		
}
