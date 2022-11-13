package exercicio3;

public class Administrador extends Empregado {
	
	private double ajudaDeCusto;

	public Administrador(String nome, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
		super(nome, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public double calcularSalario(double s) {
		return (getSalarioBase()+ ajudaDeCusto) - getImposto();
	}
}
