package exercicio3;

public class Empregado {
	
	private String nome;
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, int codigoSetor, double salarioBase, double imposto) {
		super();
		this.nome = nome;
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public double calcularSalario(double s) {
		return salarioBase - imposto;
	}

}
