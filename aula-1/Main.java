import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	 Scanner entrada = new Scanner(System.in);
        
	    System.out.print("Digite o seu nome:");
	    String meuNome = entrada.nextLine();

	    System.out.print("Digite o nome do seu:");
	    String nomeDoAmigo = entrada.nextLine();
	    
	System.out.println(meuNome != nomeDoAmigo);
	
	
	}
}
