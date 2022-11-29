package padaria.sistema.teste;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestePadaria {

	public static void main(String[] args) {

		Set<Cliente> meusClientes = new LinkedHashSet<>() {

			private static final long serialVersionUID = 1L;

			{
				add(new Cliente(1, "Paulo Assuncao", "41 9585-5656"));
				add(new Cliente(2, "Marcio Guerra", "44 8595-5566"));
				add(new Cliente(3, "Maria Helena", "11 9585-1000"));
				add(new Cliente(4, "Rogerio Lima", "41 9587-6623"));
				add(new Cliente(5, "Valeria Garcia", "41 8566-3799"));
				add(new Cliente(6, "Marcos Paulo", "21 9745-5656"));
				add(new Cliente(7, "Josi Meireles", "45 8595-5056"));
				add(new Cliente(8, "Ricardo Eletro", "12 9505-5080"));
				add(new Cliente(9, "Roberta Regina", "11 9005-6623"));

			}
		};

		Set<ClienteFisico> meusClientes1 = new LinkedHashSet<>() {
			{

				add(new ClienteFisico(11, "Victor Garcia", "31 8526-3659", "030.348.449-36"));
				add(new ClienteFisico(12, "Mario Alcantara", "11 9958-3269", "956.347.562-69"));
				add(new ClienteFisico(13, "Andressa Borges", "21 4158-9514", "528.338.411-01"));
				add(new ClienteFisico(14, "Alexandre Kranz", "31 7845-7894", "840.389.195-12"));
				add(new ClienteFisico(15, "Valeria Garcia", "41 9955-3550", "140.648.639-76"));

			}
		};
		
		Set<ClienteJuridico> meusClientes2 = new LinkedHashSet<>() {{
			
			add(new ClienteJuridico(21, "Valnei Silva", "55 9532-3512", "123456/0001.19", "123-456"));
			add(new ClienteJuridico(22, "Gimlar Santos", "55 9514-4545", "159487/0001.65", "321-654"));
			add(new ClienteJuridico(23, "Silvia Morgana", "55 9110-3641", "136258/0001.45", "213-951"));
			add(new ClienteJuridico(24, "Jose Maria", "55 8884-9845", "124589/0001.01", "312-852"));
			add(new ClienteJuridico(25, "Silmara Silva", "55 9830-5198", "123214/0001.98", "112-147"));
			
		}};
		
		System.out.println("ID\tNOME\t\tTelefone\tCPF ou CNPJ\tEscricao Estadual");
		System.out.println("-------------------------------------- + ------------- + ------------------");
		for (Cliente cliente : meusClientes)
			System.out.println("" + cliente.getId() + "\t" + cliente.getNome() + "\t" + cliente.getTelefone());

		for (ClienteFisico cliente : meusClientes1)
			System.out.println("" + cliente.getId() + "\t" + cliente.getNome() + "\t" + cliente.getTelefone() + "\t"
					+ cliente.getCpf());
		
		for (ClienteJuridico cliente : meusClientes2)
			System.out.println("" + cliente.getId() + "\t" + cliente.getNome() + "\t" + cliente.getTelefone() + "\t"
					+ cliente.getCnpj()+"\t"+cliente.getEscricaoEstadual());

	}

}
