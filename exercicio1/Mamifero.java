package exercicio1;

public class Mamifero extends Animal{
	
	private String alimento;

	public Mamifero(String nome, float comprimento, int numeroDePatas, String cor, String ambiente,
			float velocidadeMedia, String alimento) {
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public void dados() {
		super.dados();
		System.out.println("Alimento: "+getAlimento());
	}
	
	
	

}
