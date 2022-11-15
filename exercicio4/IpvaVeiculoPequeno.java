package exercicio4;

public class IpvaVeiculoPequeno extends IpvaVeiculo {
	
	private int numeroPassageiro;

	public IpvaVeiculoPequeno(String placaDoCarro, float pesoDoCarro, boolean statusIpva, int numeroPassageiro) {
		super(placaDoCarro, pesoDoCarro, statusIpva);
		this.numeroPassageiro = numeroPassageiro ;
	}

	public int getNumeroPassageiro() {
		return numeroPassageiro;
	}

	public void setNumeroPassageiro(int numeroPassageiro) {
		this.numeroPassageiro = numeroPassageiro;
	}

	@Override
	public float calculaIpva() {
		float x = (float) (getValorIpva() + getPesoDoCarro()*20/100);
		return x;
	}
	
	

}
