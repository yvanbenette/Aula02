import java.util.Scanner;

public class DesvioSimples {

	public static void main(String[] args) {
		/*Uma ONG criou um jogo para alertar as pessoas sobre os riscos das drogas.
		 *Por se tratar de um assunto sensível, ficou decidido que a idade mínima para jogar é de 12 anos.
		 *Sua função é criar um programa que receba a idade do usuário e exiba a mensagem "Você pode jogar" caso ele tenha 12 anos ou mais. */
		
		Scanner leitor = new Scanner(System.in);
		int idade;
		System.out.println("Por favor, digite a sua idade!");
		idade = leitor.nextInt();
		System.out.println("Deixe-me verificar sua idade...");
		/*Aqui devemos criar uma solução para verificar a idade do usuário*/
		
		leitor.close();

	}

}
