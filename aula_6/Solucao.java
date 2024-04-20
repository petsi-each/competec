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
public class Solucao{

    public static void main(String[] args) {
        String originalString = "Competec"; // String original
        int strlen = originalString.length(); // Variável para armazenar tamanho
        for(int i = 0;i < strlen;i++){
            System.out.println(originalString);
            originalString = rotateString(originalString); // originalString é atualizada a cada iteração
        }
    }

    public static String rotateString(String str) {
        char ultimoChar = str.charAt(str.length() - 1); 
        String stringRestante = str.substring(0, str.length() - 1);
        return ultimoChar + stringRestante;
    }
    
}