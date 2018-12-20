package desafios;
import java.util.*;
public class Tp2exercicios {

	public static void verificarPrimo(int n) {
		int soma = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				soma += 1;
			}
		}
		
		if(soma == 2) {
			System.out.println("Numero primo!");
		} else {
			System.out.println("Numero nao primo!");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o numero desejado: ");
		int numero = scanner.nextInt();
		verificarPrimo(numero);
	}

}
