package movefield;

public class Aluguel {
	private Filme filme;
	private double valorTotal;
	private int dias;
	
	
	
	public double calculoDoAluguel() {
		this.valorTotal = getDias() * filme.getPrecoDiario();
		return valorTotal;
	}
	
	public double retornarDiasAlugados(Filme filme) {
		return getDias();
	}
	
	
	
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
	
	
	
	

}
