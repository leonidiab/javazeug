class Funcionario{
	private String nome;
	protected double salario;

	public void setNome(String n){
		this.nome = n;
	}
	public void setSalario(double s){
		this.salario = s;
	}
	public String getNome(){
		return this.nome;
	}
	public double getSalario(){
		return this.salario;
	}
	public double getBonus(){
		return this.salario * 0.2;
	}
}

class Gerente extends Funcionario{
	
	public double getBonus(){
		return this.salario * 0.3;
	}
}

class Desenvolvedor extends Funcionario{
	public double getBonus(){
		return this.salario * 0.25;
	}
}

class TotalizadorDeBonus{
	private double total = 0;
	public void adiciona(Funcionario f){
		total += f.getBonus();
	}
	public double getTotal(){
		return total;
	}
}

class TestaFuncionario{
	public static void main(String[] args){
		Funcionario joao = new Funcionario();
		joao.setNome("Joao");
		joao.setSalario(4000.0);

		System.out.println("Funcionario " + joao.getNome() + " recebe " + joao.getSalario());

		Gerente pedro = new Gerente();
		pedro.setSalario(6000.0);
		pedro.setNome("Pedro");
		System.out.println("Gerente " + pedro.getNome() + " recebe " + pedro.getBonus() + " de bonus");
	
		TotalizadorDeBonus totalizador = new TotalizadorDeBonus();
		totalizador.adiciona(joao);
		totalizador.adiciona(pedro);
		System.out.println("Bonus total " + totalizador.getTotal());
	}
}