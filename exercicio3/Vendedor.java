package exercicio3;

public class Vendedor extends Empregado {
	
	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, int codigoSetor, double salarioBase, double imposto, double valorVendas) {
		super(nome, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		comissao = (valorVendas * 3) / 100;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	@Override
	public double calcularSalario(double s) {
		return (getSalarioBase()+ getComissao()) - getImposto();
	}
	
	

}
