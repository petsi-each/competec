/* Faça um método chamado rotateString 
 * que recebe uma string e realiza um deslocamento para a direita de todos os caracteres dela,
 * por exemplo a string “Competec” após 1 deslocamento fica “cCompete”,
 * a nova string deve ser devolvida pelo método. Use o método para exibir 
 * todas as rotações possíveis de uma string.
 * Exemplo:
 * Competec
 * 
 * Competec
 * cCompete
 * ecCompet
 * tecCompe
 * etecComp
 * petecCom
 * mpetecCo
 * ompetecC
 * 
 * dica: pesquise sobre o método charAt() e substring() 
 */
public class MetodoVazio{

    public static void main(String[] args) {
        String originalString = "Competec"; // String original
        int strlen = originalString.length(); // Variável para armazenar tamanho
        for(int i = 0;i < strlen;i++){
            System.out.println(originalString);
            originalString = rotateString(originalString);
        }
    }

    public static String rotateString(String str) {
        // Faça seu método aqui //
        return "";// Lembre de alterar o return
    }
    
}