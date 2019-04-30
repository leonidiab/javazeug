//precisa por as exceções aqui
//criou a propria classe de erro
public interface Calc{
	public int soma(int a, int v) throw ErrParEx;
	public int sub(int a, int b);
	public double mult(double a, double b);
	public double div(double a, double b);
}