package exercicio3;

public class teste {

	public static void main(String[] args) {
		
		//instanciando objetos
		
		Empregado administrador = new Administrador("Jose Herrera", 1, 1500, 150, 400);
		Empregado operario = new Operario("Orlando Silva", 2, 1500, 150, 5000);
		Empregado vendedor = new Vendedor("Maria Jose", 3, 1500, 150, 15000);
		
		System.out.println("-------------------------------------------------");
		System.out.println(administrador.getNome());
		System.out.println(administrador.getCodigoSetor());
		System.out.println(administrador.getSalarioBase());
		System.out.println("Salario liquido: " +administrador.calcularSalario(0));
		
		System.out.println("-------------------------------------------------");
		System.out.println(operario.getNome());
		System.out.println(operario.getCodigoSetor());
		System.out.println(operario.getSalarioBase());
		System.out.println("Salario liquido: " +operario.calcularSalario(0));
		
		System.out.println("-------------------------------------------------");
		System.out.println(vendedor.getNome());
		System.out.println(vendedor.getCodigoSetor());
		System.out.println(vendedor.getSalarioBase());
		System.out.println("Salario liquido: " +vendedor.calcularSalario(0));

	}

}
