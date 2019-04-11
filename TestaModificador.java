class TestaModificador{
	public static void main(String[] args){
		Conta joao = new Conta();
		joao.numero = 123;
		joao.setLimite(1000);

		joao.deposita(300);
		joao.saca(1);

		System.out.println(joao.getSaldo());
	}
}