package exercicio2;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;
	
	public void calcularNovoSaldo() {
		this.setSaldo(getSaldo()+(getSaldo()*0.06)); 
	}

}
