package padaria.sistema.teste;

import javax.management.remote.SubjectDelegationPermission;

public class ClienteFisico extends Cliente{
	private String cpf;
	
	public ClienteFisico() {
		
	}
	
	public ClienteFisico(int id, String nome, String telefone, String cpf) {
		super(id, nome, telefone);
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
