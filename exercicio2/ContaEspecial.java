package exercicio2;

public class ContaEspecial extends ContaBancaria {
	private double limite;
	
	

	public void setLimite(double limite) {
		this.limite = limite;
	}



	@Override
	public void setSacar(double sacar) {
		if (this.getSaldo() + this.limite > sacar) {
			super.setSacar(sacar);
		} else {
			System.out.println("Limite da conta especial sem saldo disponivel.");
		}

	}
}
