package movemethod;

public class Aluguel {
	private Filme filme;
	private int dias;
	

	public Aluguel(Filme filme, int dias) {
		this.filme = filme;
		this.dias = dias;
	}


	public double calculoDoAluguel() {
		double precoTotal = getDias() * this.filme.getPrecoDiario();
		return precoTotal;
	}
	
	
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
	
	
	

}
