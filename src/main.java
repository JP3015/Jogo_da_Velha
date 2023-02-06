import java.util.Scanner;

import entities.Jogador;
import entities.Tabuleiro;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Tabuleiro t = new Tabuleiro();
		Jogador j = new Jogador();
		
		j.setVar(true);
		int linha;
		int coluna;
		int opc = 0;
		
		while(opc != 3){
			while(t.checarColuna() == 0 && t.checarDiagonal() == 0 && t.checarLinha() == 0 ) {
				
				do {
				System.out.println("\nJogador 1 digite a linha e a coluna respectivamente.");
				System.out.print("Linha: ");
				linha = sc.nextInt();
				linha = linha - 1;
				System.out.print("Coluna: ");
				coluna = sc.nextInt();
				coluna = coluna - 1;
				} while(t.checarTabuleiro(linha, coluna) == 0);
				
				t.jogarTabuleiro(linha, coluna, j.getJogador1());
				t.exibeTabuleiro();
				
				if(t.checarColuna() == 1 || t.checarDiagonal() == 1 || t.checarLinha() == 1 ) {
					j.ganhador(1);
					break;
				}else if(t.checarColuna() == -1 || t.checarDiagonal() == -1 || t.checarLinha() == -1 ) {
					j.ganhador(-1);
					break;
				}
				
				do {
					System.out.println("\nJogador 2 digite a linha e a coluna respectivamente.");
					System.out.print("Linha: ");
					linha = sc.nextInt();
					linha = linha - 1;
					System.out.print("Coluna: ");
					coluna = sc.nextInt();
					coluna = coluna - 1;
				} while(t.checarTabuleiro(linha, coluna) == 0);
				
				t.jogarTabuleiro(linha, coluna, j.getJogador2());
				t.exibeTabuleiro();
				
				if(t.checarColuna() == 1 || t.checarDiagonal() == 1 || t.checarLinha() == 1 ) {
					j.ganhador(1);
				}else if(t.checarColuna() == -1 || t.checarDiagonal() == -1 || t.checarLinha() == -1 ) {
					j.ganhador(-1);
				}
				
			}
			
			System.out.println("\nDigite 1 caso queira re-jogar\nDigite 2 caso queira rejogar e trocar os símbolos\nDigite 3 caso queira sair");
			opc = sc.nextInt();
			
			switch(opc) {
				case 1:
					t.zerarTabuleiro();
					break;
				case 2:
					t.zerarTabuleiro();
					j.setVar(j.isVar());
					break;
				case 3:
					System.out.println("\nSaindo....");
					break;
				default:
					System.out.println("\nEsse comando não existe, digite novamente.");
					break;
			}
		}
		
	}
}


