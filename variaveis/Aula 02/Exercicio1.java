import java.util.Scanner;

public class Exercicio1
{
	public static void main(String[] args) {
        double cod1, cod2, temp1, temp2;
        Scanner leia = new Scanner(System.in);

		System.out.println("Digite o código da temperatura usada");
        cod1 = leia.nextDouble();
        System.out.println("Digite o código da temperatura na qual deseja converter");
        cod2 = leia.nextDouble();
        System.out.println("Digite a temperatura");
        temp1 = leia.nextDouble();

        if(cod1 == 1) {
            if(cod2 == 2) {
                System.out.println("Sua temperatura é celsius");
                System.out.println("Sua conversão será para fahrenheith");
                temp2 = ((temp1 * 9/5) + 32);
                System.out.println("Sua temperatura em fahrenheith é: " + temp2);
            }
        }
        if(cod1 == 2) {
            if(cod2 == 1) {
                System.out.println("Sua temperatura é fahrenheith");
                System.out.println("Sua conversão será para celsius");
                temp2 = ((temp1 -32) *5/9);
                System.out.println("Sua temperatura em celsius é: " + temp2);
            }
        }
	}
}