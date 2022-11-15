package exercicio4;

public class TesteIpva {

	public static void main(String[] args) {
		IpvaVeiculo carro = new IpvaVeiculo("BBC-1478", 917, true);
		IpvaVeiculo onibus = new IpvaVeiculoGrande("CPP-2002", 2500, false);
		IpvaVeiculo carro2 = new IpvaVeiculoPequeno("PJA-9854", 1050, true, 5);

		System.out.println("Veiculo Placa: " + carro.getPlacaDoCarro());
		System.out.println("Veiculo Peso: " + carro.getPesoDoCarro());
		float valorIpva = carro.calculaIpva();
		System.out.println("Valor a pagar Ipva: R$" + valorIpva);
		System.out.print("Status: ");
		if (carro.isStatusIpva() == false)
			System.out.println("Ipva em aberto.");
		else
			System.out.println("Ipva Pago.");
		
		System.out.println("--------------------------------------");
		
		System.out.println("Veiculo Placa: " + onibus.getPlacaDoCarro());
		System.out.println("Veiculo Peso: " + onibus.getPesoDoCarro());
		float valor = onibus.calculaIpva();
		System.out.println("Valor a pagar Ipva: R$" + valor);
		System.out.print("Status: ");
		if (onibus.isStatusIpva() == false)
			System.out.println("Ipva em aberto.");
		else
			System.out.println("Ipva Pago.");
		
		System.out.println("--------------------------------------");
		
		System.out.println("Veiculo Placa: " + carro2.getPlacaDoCarro());
		System.out.println("Veiculo Peso: " + carro2.getPesoDoCarro());
		float valor3 = carro2.calculaIpva();
		System.out.println("Valor a pagar Ipva: R$" + valor3);
		System.out.print("Status: ");
		if (carro2.isStatusIpva() == false)
			System.out.println("Ipva em aberto.");
		else
			System.out.println("Ipva Pago.");

	}

}
