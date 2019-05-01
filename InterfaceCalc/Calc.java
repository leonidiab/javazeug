//precisa por as exceções aqui
//criou a propria classe de erro
public interface Calc{
	public int soma(int a, int b);// throws ErrParEx;
	public int sub(int a, int b);// throws ErrParEx;
	public double mult(double a, double b);
	public double div(double a, double b);// throws ErrParEx;
}