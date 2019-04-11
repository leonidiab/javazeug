class Conta{
	Cliente titular;
	int numero;
	int agencia;
	private double saldo;
	private double limite;

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
}

class Cliente{
	String nome;
	String cpf;
	String endereco;
	String dataNascimento;
}
