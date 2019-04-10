class Conta{
	String titular;
	int numero;
	int agencia;
	double saldo;

	void deposita(double valorAserDepositado){
		this.saldo = saldo + valorAserDepositado;
	}
	void saca(double valorAserDebitado){
		if (saldo >= valorAserDebitado){ //essa regra será propagada
			this.saldo = saldo - valorAserDebitado;
		}
		else{
			System.out.println("Valor acima do saldo");
		}
	}
	void transfere(double valor, Conta destino){
		if (this.saldo >= valor){
			this.saca(valor);
			destino.deposita(valor);
		}
		else{
			System.out.println("Valor acima do permitido");
		}
	}
}

class Programa{
	public static void main(String[] args){
		Conta mauricio = new Conta();
		mauricio.numero = 123;
		mauricio.titular = "Mauricio Doidao";
		mauricio.agencia = 1082;
		mauricio.saldo = 100.1;

		Conta maria = new Conta();

		mauricio.transfere(50, maria);

		System.out.println(mauricio.saldo);
		System.out.println(maria.saldo);
	}

}