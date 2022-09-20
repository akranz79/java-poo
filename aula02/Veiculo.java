package aula2;

public class Veiculo {

	String marca;
	String modelo;
	int anoFabricacao;
	float motor;
	boolean ligado;
	
	void status() {
		System.out.println("Status : " + this.ligado);
		System.out.println("Veiculo Marca: "+ this.marca);
		System.out.println("Veiculo Modelo: "+ this.modelo);
		System.out.println("Veiculo Ano de Fabricacao: " + this.anoFabricacao);
		System.out.println("Veiculo motorizacao: "+ this.motor);
		System.out.println("Motor ligado? :"+ this.ligado );
}
	void ligado() {
		this.ligado = true;
	}
	void desligado() {
		this.ligado = false;
	}
	void passear() {
		if (this.ligado == true) {
			System.out.println("Vamos passear!");
		} else {
			System.out.println("Vamos ficar em casa!");
		}
	}

}
	
