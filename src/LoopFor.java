import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int numero;
		int resultado;
		
		System.out.println("Digite o número que deseja saber a tabuada");
		numero = leitor.nextInt();
		
		for(int i=1; i<=10; i++) {
			resultado = i * numero;
			System.out.println(numero + " x " + i +" = "+resultado);
		}

	}

}
