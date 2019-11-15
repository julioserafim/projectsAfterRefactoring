package extractsuperclass;

public class Estudante extends Pessoa{
	
	private String matricula;
	private double ira;
	

	public void estudarParaProvaFacul() {
		System.out.println("Estudando");
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getIra() {
		return ira;
	}
	public void setIra(double ira) {
		this.ira = ira;
	}
	
	
	
	
	
	

}
