package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade? ");
		String nasc = JOptionPane.showInputDialog("Qual a data nascimento? ");
		String rg = JOptionPane.showInputDialog("Qual o RG? ");
		String cpf = JOptionPane.showInputDialog("Qual o CPF? ");
		String mae = JOptionPane.showInputDialog("Qual o nome da mae? ");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai? ");
		String matricula = JOptionPane.showInputDialog("Qual data matricula? ");
		String escola = JOptionPane.showInputDialog("Qual o nome da Escola? ");
		String serie = JOptionPane.showInputDialog("Qual a serie? ");
		
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1: ");
		String nota1 = JOptionPane.showInputDialog("Nota 1: ");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2: ");
		String nota2 = JOptionPane.showInputDialog("Nota 2: ");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3: ");
		String nota3 = JOptionPane.showInputDialog("Nota 3: ");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4: ");
		String nota4 = JOptionPane.showInputDialog("Nota 4: ");
		
		

		Aluno aluno1 = new Aluno();
				
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(nasc);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMAtriculado(serie);
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		

		
		
		/*System.out.println("O nome do aluno e: "+aluno1.getNome());
		System.out.println("Idade: "+aluno1.getIdade());
		System.out.println("Data de Nascimento: "+aluno1.getDataNascimento());
		System.out.println("Registro Geral: "+aluno1.getRegistroGeral());
		System.out.println("Numero CPF: "+aluno1.getNumeroCpf());
		System.out.println("Nome da mae: "+aluno1.getNomeMae());
		System.out.println("Nome do pai: "+aluno1.getNomePai());
		System.out.println("Data de matricula: "+aluno1.getDataMatricula());
		System.out.println("Escola: "+aluno1.getNomeEscola());
		System.out.println("Serie: "+aluno1.getSerieMAtriculado());*/
		
		System.out.println(aluno1.toString());
		System.out.println("Media: "+aluno1.getMediaNota());
		System.out.println(aluno1.getAprovado());

	}

}
