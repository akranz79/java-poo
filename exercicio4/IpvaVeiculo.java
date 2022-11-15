package exercicio4;

public class IpvaVeiculo {
	
	private String placaDoCarro;
	private float pesoDoCarro;
	private float valorIpva = 300;
	private boolean statusIpva;
	
	public IpvaVeiculo(String placaDoCarro, float pesoDoCarro, boolean statusIpva) {
		super();
		this.placaDoCarro = placaDoCarro;
		this.pesoDoCarro = pesoDoCarro;
		this.statusIpva = statusIpva;
	}

	public String getPlacaDoCarro() {
		return placaDoCarro;
	}

	public void setPlacaDoCarro(String placaDoCarro) {
		this.placaDoCarro = placaDoCarro;
	}

	public float getPesoDoCarro() {
		return pesoDoCarro;
	}

	public void setPesoDoCarro(float pesoDoCarro) {
		this.pesoDoCarro = pesoDoCarro;
	}

	public boolean isStatusIpva() {
		return statusIpva;
	}

	public void setStatusIpva(boolean statusIpva) {
		this.statusIpva = statusIpva;
	}

	public double getValorIpva() {
		return valorIpva;
	}
	
	public void setValorIpva(float valorIpva) {
		this.valorIpva = valorIpva;
	}

	public float calculaIpva() {
		return valorIpva += (getPesoDoCarro() * 10/100);
	}
	
	

}

