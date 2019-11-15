package decomposeconditional;

import java.util.Date;

public class HotelEmJeri {
	private double taxaVerao;
	private double taxaInverno;
	private static final int julho = 7;
	private static final int dezembro = 12;

	
	
	public double precoDiaria(int mes, double precoBase) {
		double precoTotal;
		
		if(isFerias(mes)) {
			precoTotal = calcularValorNasFerias(precoBase, taxaVerao);
		}
		else {
			precoTotal = calcularValorNoInverno(precoBase, taxaInverno);
		}
		
		return precoTotal;
				
	}
	
	public boolean isFerias(int mes) {
		return (mes == julho|| mes == dezembro);	
	}
	
	public double calcularValorNasFerias(double precoBase, 
			double taxaVerao) {
		return precoBase * taxaVerao;
	}
	
	public double calcularValorNoInverno(double precoBase, 
			double taxaInverno) {
		
		return precoBase * taxaInverno;
	}
	

}
