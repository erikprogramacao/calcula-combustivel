package entities;

import java.util.ArrayList;
import java.util.List;

public class Motoboy {
	private static final double valorGasolina = 7;
	private String nome;
	private double totalCombustivel;
	
	private List<KilometroDiario> kilometros = new ArrayList<>();
	
	public Motoboy() {
	}

	public Motoboy(String nome) {
		this.nome = nome;
		this.totalCombustivel = 0.0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTotalCombustivel() {
		return totalCombustivel;
	}

	public void setTotalCombustivel(Double totalCombustivel) {
		this.totalCombustivel = totalCombustivel;
	}

	public List<KilometroDiario> getKilometros() {
		return kilometros;
	}
	
	public void addKmDiario(KilometroDiario kilometroDiario) {
		kilometros.add(kilometroDiario);
	}
	
	public double distanciaTotal() {
		double soma = 0;
		for(KilometroDiario kd : kilometros){
			soma += kd.totalKmDiario();
		}
		
		return soma;
	}
	
	public double somaCombustivel() {
		return distanciaTotal() / 30 * valorGasolina;
	}
}
