package desafios;
import java.util.*;
public class FormaTriangulo {

	
	public static void verificaTriangulo(int a, int b, int c) {
		if((a+b>c)&&(a+c>b)&&(b+c>a)) {
			System.out.println("Triangulo!");
		} else {
			System.out.println("Nao é triangulo!");
		}
	}
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Entre com os lados do possivel triangulo: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		verificaTriangulo(a,b,c);
	}

}
