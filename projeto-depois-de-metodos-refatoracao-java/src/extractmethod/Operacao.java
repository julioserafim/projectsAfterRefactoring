package extractmethod;

public class Operacao {
	
	
	public void mostrarSoma(int a, int b) {
		imprimirBanner();
		
		System.out.println(somar(a, b));
		
	}
	
	public double somar(int a, int b) {
		return a + b;
	}
	
	public void mostrarSubtracao(int a, int b) {
		imprimirBanner();
		
		System.out.println(a - b);
	}
	
	public void imprimirBanner() {
		System.out.println("--------Calculadora do amor------------");
		System.out.println("O resultado da operação é: ");
	}

}
