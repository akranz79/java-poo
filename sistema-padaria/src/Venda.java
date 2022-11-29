package padaria.sistema.teste;

public class Venda {
	
	Cliente cliente;
	int diaVenda;
	int mesVenda;
	Produto produto;
	int quantidadeVendida;
	double valorVenda;
	double meioPagamento;
	boolean statusVenda;
	
	public Venda() {
		
	}
	
	public Venda(Cliente cliente, int dia, int mes, Produto produto, int qtde, 
			double valorVenda, double pgmto, boolean status) {
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getDiaVenda() {
		return diaVenda;
	}

	public void setDiaVenda(int diaVenda) {
		this.diaVenda = diaVenda;
	}

	public int getMesVenda() {
		return mesVenda;
	}

	public void setMesVenda(int mesVenda) {
		this.mesVenda = mesVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getMeioPagamento() {
		return meioPagamento;
	}

	public void setMeioPagamento(double meioPagamento) {
		this.meioPagamento = meioPagamento;
	}

	public boolean isStatusVenda() {
		return statusVenda;
	}

	public void setStatusVenda(boolean statusVenda) {
		this.statusVenda = statusVenda;
	}
	
	

}
