package padaria.sistema.teste;

public class ClienteJuridico extends Cliente{
	
	String cnpj;
	String escricaoEstadual;
	
	public ClienteJuridico() {
		
	}
	
	public ClienteJuridico(int id, String nome, String telefone, String cnpj, String escricao) {
		super(id, nome, telefone);
		this.cnpj = cnpj;
		this.escricaoEstadual = escricao;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEscricaoEstadual() {
		return escricaoEstadual;
	}

	public void setEscricaoEstadual(String escricaoEstadual) {
		this.escricaoEstadual = escricaoEstadual;
	}
	
	

}
