package extractsubclass;

public class Programador extends Pessoa{
	private String linguagemDeProgramacaoFavorita;
	
	
	
	public void programar() {
		System.out.println("Programando");
	}

	public String getLinguagemDeProgramacaoFavorita() {
		return linguagemDeProgramacaoFavorita;
	}

	public void setLinguagemDeProgramacaoFavorita(String linguagemDeProgramacaoFavorita) {
		this.linguagemDeProgramacaoFavorita = linguagemDeProgramacaoFavorita;
	}
	
	
}
