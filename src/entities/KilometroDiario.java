package entities;

public class KilometroDiario {
	private Double kmInicial;
	private Double kmFinal;
	
	public KilometroDiario() {}

	public KilometroDiario(Double kmInicial, Double kmFinal) {
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}
	
	public double getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}

	public double getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}

	public double totalKmDiario() {
		return kmFinal - kmInicial;
	}
}
