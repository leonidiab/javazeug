class Turma{ //classe que contém um conjunto de objetos da classe Aluno
	Aluno[] alunos; //cria array de objetos da classe Aluno

	void imprimeNotas(){
		for (int i = 0; i<this.alunos.length; i++){ //percorre array de objetos da classe Aluno
			Aluno aluno = this.alunos[i]; //cria uma variável que receberá individualmente cada objeto aluno do array
			if (aluno == null) continue; //ignora os alunos inexistentes
			System.out.println(aluno.nota); //imprime a nota de cada objeto individualmente
		}
	}
}

class Aluno{
	String nome;
	double nota;
}

class TestaTurma{
	public static void main(String[] args){
		Turma turma = new Turma();
		turma.alunos = new Aluno[10]; //cria um array de 10 objetos do tipo Aluno
		turma.alunos[0] = new Aluno(); //cria o objeto individual do tipo Aluno que ocupa a posição 0 do array de objetos do tipo Aluno
		turma.alunos[0].nome = "Joaquim";
		turma.alunos[0].nota = 4.5;

		turma.imprimeNotas();
	}
}