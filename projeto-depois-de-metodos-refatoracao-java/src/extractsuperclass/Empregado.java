package extractsuperclass;

public class Empregado extends Pessoa{

	private String carteiraDeTrabalho;
	


	public void trabalharEscritorio() {
		System.out.println("Trabalhando no escritório");
	}
	
	
	public String getCarteiraDeTrabalho() {
		return carteiraDeTrabalho;
	}
	public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
		this.carteiraDeTrabalho = carteiraDeTrabalho;
	}
	
	
}
