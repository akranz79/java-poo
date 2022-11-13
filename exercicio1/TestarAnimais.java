package exercicio1;

public class TestarAnimais {

	public static void main(String[] args) {
		Animal animal = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2.0f);
		Animal peixe = new Peixe("Tubarao", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
		Animal mamifero = new Mamifero("Urso-do-Canada", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");
		animal.dados();
		peixe.dados();
		mamifero.dados();

	}

}
