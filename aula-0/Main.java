/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	     char brenno ='b';
	    int idade = 14;
	    boolean tomouCafe = true;
	    
	    int valorLaranja = 5;
	    int valorUva = 10;
	    int soma = valorLaranja + valorUva;
	    

	    
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Digite o valor da banana:");
	    int banana = entrada.nextInt();
	    
	    System.out.print("Digite o valor da maça:");
	    int maca = entrada.nextInt();
	    
	    System.out.println("Resultado da soma =" + (banana + maca) );
	}
}
