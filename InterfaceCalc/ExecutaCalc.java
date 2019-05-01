public class ExecutaCalc extends ImplementaCalc{
	public static void main(String[] args){
		ImplementaCalc calculos = new ImplementaCalc();
		int som = calculos.soma(100,100);
		int sub = calculos.sub(3,2);
		double m = calculos.mult(7,5);
		double d = calculos.div(20,2);
		System.out.println(som);
		System.out.println(sub);
		System.out.println(m);
		System.out.println(d);
	}
}