import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        int idade1;
        int idade2;
        boolean alunoMaior;

        Scanner leia = new Scanner(System.in);
        
        System.out.println("digite a idade do aluno: ");
        idade1 = leia.nextInt();
        System.out.println("digite a idade do professor: ");
        idade2 = leia.nextInt();

        if(idade1>idade2) {
            alunoMaior = true;
            System.out.println(alunoMaior);
            System.out.println("aluno é mais velho que o professor");
        }
        else if (idade1<idade2) {
            alunoMaior = false;
            System.out.println(alunoMaior);
            System.out.println("O Professor é mais velho que o aluno");
        }
        else {
            alunoMaior = false;
            System.out.println(alunoMaior);
            System.out.println("Os dois possuem a mesma idade");
        }


    }
}

// 1. Se estiver chovendo E relampejando, eu não sairei de casa. Tente fazer essa comparação lógica no código
// 2. Se tiver macarrão ou estrogonofe hoje no almoço, vou ficar muito feliz! Tente fazer essa comparação lógica no código.

public class Exercicio3 {
    public static void main(String[] args) {
        // Escreva seu código aqui ⬇️


    }
}