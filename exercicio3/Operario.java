package exercicio3;

public class Operario extends Empregado{
	
	private double valorProducao;
	private double comissao;

	public Operario(String nome, int codigoSetor, double salarioBase, double imposto, double valorProducao) {
		super(nome, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		comissao = (valorProducao * 5) / 100;
	}
	

	public double getValorProducao() {
		return valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	@Override
	public double calcularSalario(double s) {
		return ((getSalarioBase()+getComissao())-getImposto());
	}
	
	

}
