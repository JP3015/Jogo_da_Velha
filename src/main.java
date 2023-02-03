import java.util.Scanner;

import entities.Jogador;
import entities.Tabuleiro;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Tabuleiro t = new Tabuleiro();
		Jogador j = new Jogador();
		
		int linha;
		int coluna;
		
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
			
			do {
				System.out.println("\nJogador 2 digite a linha e a coluna respectivamente.");
				System.out.print("Linha: ");
				linha = sc.nextInt();
				linha = linha - 1;
				System.out.print("Coluna: ");
				coluna = sc.nextInt();
				coluna = coluna - 1;
			} while(t.checarTabuleiro(linha, coluna) == 0);
			
			t.checarTabuleiro(linha, coluna);
			t.jogarTabuleiro(linha, coluna, j.getJogador2());
			t.exibeTabuleiro();
			
		}
		
	}

}
