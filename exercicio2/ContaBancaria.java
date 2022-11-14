package exercicio2;

public class ContaBancaria {

	private String cliente;
	private int num_conta;
	private double saldo;
	private double sacar;
	private double depositar;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNum_conta() {
		return num_conta;
	}

	public void setNum_conta(int num_conta) {
		this.num_conta = num_conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}

	public double getSacar() {
		return sacar;
	}

	public void setSacar(double sacar) {
		this.sacar = sacar;
		if (sacar > saldo) {
			System.out.println("Saldo insuficiente.");
		} else {
			saldo = this.saldo - this.sacar;
		}
	
	}

	public double getDepositar() {
		return depositar;
	}

	public void setDepositar(double depositar) {
		this.depositar = depositar;
		saldo = this.saldo + this.depositar;

	}

}
