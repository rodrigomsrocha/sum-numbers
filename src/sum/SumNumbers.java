package sum;
import java.util.*;

class SumNumbers {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2, soma;
		
		System.out.println("Digite um número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.printf("O resultado é: %d\n", soma);
	}
}
