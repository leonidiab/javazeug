class Conta{
	Cliente titular;
	int numero;
	int agencia;
	private double saldo;
	private double limite;
	private static int numeroIncremental = 1; //ao falarmos que é static, deixamos claro que essa variável será compartilhada por todos os objetos do tipo Conta, ou seja, uma variável global

	public Conta(int numero, double limite){//Invoca o construtor de baixo
		this(numero, limite, 0);
	}
	public Conta(int numero, double limite, double saldoInicial){//Construtor que precisa ter o mesmo nome da classe
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldoInicial;
	}

	public Conta(){
		this.numero = numeroIncremental;
		numeroIncremental++;
	}

	public void deposita(double valorAserDepositado){
		this.saldo = saldo + valorAserDepositado;
	}
	public void saca(double valorAserDebitado){
		if (saldo >= valorAserDebitado){ //essa regra será propagada
			this.saldo = saldo - valorAserDebitado;
		}
		else{
			System.out.println("Valor acima do saldo");
		}
	}
	public void transfere(double valor, Conta destino){
		if (this.saldo >= valor){
			this.saca(valor);
			destino.deposita(valor);
		}
		else{
			System.out.println("Valor acima do permitido");
		}
	}
	public double getSaldo(){ //pega o saldo
		return this.saldo;
	}
	public void setLimite(double novoLimite){ //muda o limite
		this.limite = novoLimite;
	}
	public double getLimite(){ //muda o limite
		return this.limite;
	}
}

class Cliente{
	String nome;
	String cpf;
	String endereco;
	String dataNascimento;
}
