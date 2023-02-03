package entities;

public class Jogador {
	
	boolean var = false; 
	private int jogador1 = var ? -1 : 1;
	private int jogador2 = var ? 1 : -1;
		
	
	
	public int getJogador1() {
		return jogador1;
	}
	public void setJogador1(int jogador1) {
		this.jogador1 = var ? -1 : 1;
	}
	public int getJogador2() {
		return jogador2;
	}
	public void setJogador2(int jogador2) {
		this.jogador2 = var ? 1 : -1;
	}
	
}
