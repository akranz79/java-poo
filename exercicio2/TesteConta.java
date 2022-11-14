package exercicio2;

public class TesteConta {
	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		ContaEspecial ce = new ContaEspecial();
		
		cp.setCliente("Raimundo Novaes");
		cp.setSaldo(200.0);
		cp.setDepositar(50);
		cp.setSacar(100);
		
		ce.setCliente("Joana Silva");
		ce.setSaldo(700);
		ce.setLimite(300);
		ce.setDepositar(15);
		ce.setSacar(700);
			
		System.out.println("------- Extrato -------");
		System.out.println("Cliente: "+cp.getCliente());
		System.out.println("Saque: "+cp.getSacar());
		System.out.println("Saldo Conta: "+cp.getSaldo());
		
		System.out.println("------- Extrato -------");
		System.out.println("Cliente: "+ce.getCliente());
		System.out.println("Saque: "+ce.getSacar());
		System.out.println("Saldo Conta: "+ce.getSaldo());
		
	}

}
