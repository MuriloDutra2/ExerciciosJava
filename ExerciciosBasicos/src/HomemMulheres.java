
import java.util.Scanner;

public class HomemMulheres {
	public static void main(String[] args) {
		 
		
		//variaveis 
		int sexo, qtMulheres = 0, qtHomens = 0;
		
		float altura, somaH = 0,mediaHomens = 0, maior = 0, menor = 10;
		
		//Codigo
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			//sexo
			System.out.println("Escolha o sexo da pessoa ( 1- mulher 2 - Homem ) ");
			sexo = entrada.nextInt();
			
			//Altura
			System.out.println("Digite a altura: ");
			altura = entrada.nextFloat();
			
			//Testando o sexo
			if (sexo == 1) {
				qtMulheres++;
				
			} if (sexo == 2 ) {
				qtHomens++;
				somaH = somaH + altura;
			}else {
				System.out.println("Opção sexo invalido");
			}
			//altura
			if (altura > maior ) {
				maior = altura;
			}else if ( altura < menor) {
				menor = altura;
			}
		}
		//Media da altura dos homens
		mediaHomens = somaH /qtHomens;
		
		//Dados coletados
		System.out.println("A maior altura é de " + maior + "m, e a menor é de " + menor + " m");
		System.out.println("A media de altura dos homens é de " +  mediaHomens);
		System.out.println("O numero de mulheres é de " + qtMulheres);
		
		
		entrada.close();
	}

}
