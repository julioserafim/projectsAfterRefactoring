package extractsubclass;

public class Empregado extends Pessoa{
	private String nomeEmprego;
	
	public void trabalhar() {
		System.out.println("Trabalhando");
	}

	public String getNomeEmprego() {
		return nomeEmprego;
	}

	public void setNomeEmprego(String nomeEmprego) {
		this.nomeEmprego = nomeEmprego;
	}
	
	
}
