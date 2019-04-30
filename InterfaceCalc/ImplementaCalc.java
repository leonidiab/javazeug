public class ImplementaCalc implements Calc{
	@Override
	public int soma(int a, int b){
		return a + b;
	}
	public int sub(int a, int b){
		return a - b;
	}
	public double mult(double a, double b){
		return a * b;
	}
	public double div(double a, double b){
		return a / b;
	}
}