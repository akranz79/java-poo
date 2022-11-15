package exercicio4;

public class IpvaVeiculoGrande extends IpvaVeiculo {
	
	private float cargaSuportada;

	public IpvaVeiculoGrande(String placaDoCarro, float pesoDoCarro, boolean statusIpva) {
		super(placaDoCarro, pesoDoCarro, statusIpva);
	}
	
	

	public float getCargaSuportada() {
		return cargaSuportada;
	}



	public void setCargaSuportada(float cargaSuportada) {
		this.cargaSuportada = cargaSuportada;
	}



	@Override
	public float calculaIpva() {
		float x = (float) (getValorIpva() + getPesoDoCarro()*30/100);
		return x;
	}
	
	

}
