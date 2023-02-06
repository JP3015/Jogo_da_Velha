package entities;

public class Tabuleiro {

	private int[][] tabuleiro = new int[3][3];
	
	
	public Tabuleiro(){
		zerarTabuleiro();
	}
	
	public void zerarTabuleiro(){
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				tabuleiro[linha][coluna] = 0;
			}
		}
	}
	
	public void exibeTabuleiro(){
		System.out.println();
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				if(tabuleiro[linha][coluna] == -1) {
					System.out.print(" X ");
				}if(tabuleiro[linha][coluna] == 1) {
					System.out.print(" O ");
				}if(tabuleiro[linha][coluna] == 0) {
					System.out.print("   ");
				}
				if(coluna == 0 || coluna == 1) {
					System.out.print("|");
				}
				
			}
		System.out.println();
		}
	}
	
	public int checarTabuleiro(int linha, int coluna) {
		if (linha > 3 || coluna > 3) {
			System.out.println("\nLinha ou coluna não existe, coloque um número de 1 a 3 somente.");
			return 0;
		}else if (tabuleiro[linha][coluna] != 0) {
				System.out.println("\nEssa posição já foi jogada!");
				return 0;
		}else {
			return 1;
		}
	}
	
	public void jogarTabuleiro(int linha, int coluna, int jogador) {
		tabuleiro[linha][coluna] = jogador;	
	}
	
	public int checarLinha() {
		for(int linha=0;linha<3;linha++) {
			if(tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2] == -3) {
				return -1;
			}
			if(tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2] == 3) {
				return 1;
			}
		}
		return 0;
	}
	
	public int checarColuna() {
		for(int coluna=0;coluna<3;coluna++) {
			if(tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna] == -3) {
				return -1;
			}
			if(tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna] == 3) {
				return 1;
			}
		}
		return 0;
	}
	
	public int checarDiagonal() {
			if(tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == -3) {
				return -1;
			}
			if(tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2] == 3) {
				return 1;
			}
			if(tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0] == -3) {
				return -1;
			}
			if(tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0] == 3) {
				return 1;
			}
		return 0;
	}
}
