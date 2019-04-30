import java.util.*;
import java.io.*;

public class ExecutaCalc extends ImplementaCalc{
	public static void main(String[] args) throws IOException{
		BufferedReader leOp = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Entre com a operacao: ");
		String operacao = leOp.readLine();
		System.out.println(operacao);
		if (operacao == "soma"){
			System.out.println("Entre com o primeiro inteiro: ");
			BufferedReader leA = new BufferedReader(new InputStreamReader(System.in));
			try{
				int a = Integer.parseInt(leA.readLine());
				try{
					System.out.println("Entre com o segundo inteiro: ");
					BufferedReader leB = new BufferedReader(new InputStreamReader(System.in));
					int b = Integer.parseInt(leB.readLine());
					Calc soma = new Calc();
					int result = soma(a, b);
					System.out.printf(a," + ", b," = ", result,"\n");
				}catch(NumberFormatException e2){
					System.out.println("Por favor entre com o inteiro b \n");
				}
			}catch(NumberFormatException e1){
				System.out.println("Por favor entre com o inteiro a \n");
			}
		}
		/*else if (operacao == "sub"){

		}
		else if (operacao == "mult"){

		}
		else if(operacao == "div"){

		}*/
		else{
			System.out.println("Operacao invalida \n");
		}
	}
}