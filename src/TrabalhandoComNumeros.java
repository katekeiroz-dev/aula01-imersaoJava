import java.util.Scanner;

public class TrabalhandoComNumeros {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma;
		int multiplicacao;
		double divisao;
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Por favor ,informe o primeiro valor:");
		valor1 = leitor.nextInt();
		System.out.println("Por favor, informe o segundo valor");
		valor2 = leitor.nextInt();
		soma = valor1 + valor2;
		System.out.println("A soma dos dois valores e " + soma);
		multiplicacao = valor1 * valor2;
		System.out.println("A multiplicacao dos dois valores e " + multiplicacao);
		divisao = valor1 /(double) valor2;
		System.out.println("A divisao dos dois valores e " + divisao);
		
		

	}

}
