package aula2;

public class Caneta {

		String modelo;
		String cor;
		float ponta;
		int carga;
		boolean tampada;
		
		void status() {
			System.out.println(" Modelo: "+ this.modelo);
			System.out.println(" Cor: " + this.cor);
			System.out.println(" Ponta: "+ this.ponta);
			System.out.println(" Carga: "+ this.carga);
			System.out.println(" Esta tampada?: " + this.tampada);
		}
		
		void rabiscar() {
			if (this.tampada == true) {
				System.out.println("Erro. Nao posso rabiscar");
			} else {
				System.out.println("Estou rabiscando...");
			}
		}
		
		void tampar() {
			this.tampada = true;
			System.out.println("Status atual: Tampada");
		}
		void destampar() {
			this.tampada = false;
			System.out.println("Status atual: Destampada");
		}
}
