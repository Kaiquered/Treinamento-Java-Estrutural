import java.util.Scanner;

//programa que calcula o fatorial de um n�mero

public class ForQ5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");

		int n = input.nextInt();
		int fat = 1;

		for (int i = 0; i < (n - 1); i++)
			fat *= (n - i);

		System.out.printf("O Fatorial de %d � %d", n, fat);

		input.close();
	}
}