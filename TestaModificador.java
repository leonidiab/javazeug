class TestaModificador{
	public static void main(String[] args){
		Conta joao = new Conta();
		joao.numero = 123;
		joao.saldo = 1200.5;

		joao.deposita(300);
		joao.saca(1);

		System.out.println(joao.saldo);
	}
}