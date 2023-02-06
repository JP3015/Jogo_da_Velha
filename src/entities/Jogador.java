package entities;

public class Jogador {
	
	private boolean var; 
	private int jogador1;
	private int jogador2;
		
	
	
	public int getJogador1() {
		return jogador1;
	}
	
	public int getJogador2() {
		return jogador2;
	}
	
	public boolean isVar() {
		return var;
	}
	
	public void setVar(boolean var) {
		if(var != true) {
			this.var = true;
		}else {
			this.var = false;
		}
		this.jogador1 = this.var ? -1 : 1;
		this.jogador2 = this.var ? 1 : -1;
	}
	
	public void ganhador( int number) {
		if(jogador1 == number) {
			System.out.println("\nO jogador 1 ganhou!!");
			System.out.println("\n------------------ O jogo acabou!! ------------------");
		}else {
			System.out.println("\nO jogador 2 ganhou!!");
			System.out.println("\n------------------ O jogo acabou!! ------------------");
		}
	}
	
}
