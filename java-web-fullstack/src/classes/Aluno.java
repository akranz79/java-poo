package cursojava.classes;

import java.util.Objects;

public class Aluno {

	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	Disciplina disciplina = new Disciplina();

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Aluno() {
	}

	public Aluno(String nomePadrao, int indade) {
		nome = nomePadrao;
		idade = indade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public String getSerieMAtriculado() {
		return serieMatriculado;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public void setSerieMAtriculado(String serieMAtriculado) {
		this.serieMatriculado = serieMAtriculado;
	}

	public double getMediaNota() {
		return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;
	}
	
	public boolean getAprovado() {
		if(getMediaNota() >= 70) {
			return true;
		}else 
			return false;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}
	


	}


