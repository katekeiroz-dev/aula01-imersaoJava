import java.util.Scanner;
public class LendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		System.out.println("Por favor, digite o seu nome: ");
		Scanner leitor = new Scanner(System.in);
		nome = leitor.next();
		System.out.println("boa noite pra vc," + nome);
		leitor.close();
	

	}

}
