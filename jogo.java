package javaapplication2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Classe que executa o jogo
 * @author juans
 */
public class jogo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do seu caminho minado");
        int num = entrada.nextInt(); // Pede o tamanho do array, armazena e cria esse array
        System.out.println("Digite o numero de bombas");
        int bomba = entrada.nextInt(); // Pede a quantidade de bombas e armazena
        if(num > 1 && bomba > 1){ // Se os numeros poderem formar algo jogável, o final do código é executado
        ArrayList<Integer> caminhoMinado = new ArrayList<>(); // Cria o array
        for (int i = 0; i < (num - bomba); i++) {
            caminhoMinado.add(0); // Add 0 aos array (sem bomba)
        }
        for (int a = 0; a < bomba; a++) {
            caminhoMinado.add(-1); // Add -1 aos arrays (com bomba)
        }
        Collections.shuffle(caminhoMinado); // Embaralha os -1 e os 0
        Collections.shuffle(caminhoMinado); // Embaralha os -1 e os 0
        Collections.shuffle(caminhoMinado); // Embaralha os -1 e os 0
        
        ArrayList<String> caminhoMinadoUsuario = new ArrayList<>(); // Cria o array que será mostrado ao terminal para o usuário
            for (Integer a : caminhoMinado) {
                caminhoMinadoUsuario.add("_ ");
            }
        
        int pontos = 0; // Cria uma variável para armazenar os pontos
        System.out.println("");
        for (int i = 0; i < (caminhoMinado.size() - bomba); i++) { // Mostra o caminho minado para o usuário
            for (String string : caminhoMinadoUsuario) {
                System.out.print(string);
            }
            
            System.out.println("");
            System.out.println("Digite o seu chute entre 1 a " + caminhoMinado.size()); // Pede o chute para o usuário
            
            int chute = entrada.nextInt(); // Armazena o chute
            if(caminhoMinadoUsuario.get(chute-1).equals("X ")){ // Verifica se esse chute já foi escolhido antes
                System.out.println("Você não me engana, você tentou digitar o mesmo número pra acumular pontos, agora você perdeu...");
                System.out.println("Game Over");
                break;
            }
                
            int valor = caminhoMinado.get(chute - 1); // Armazena o valor do index do array do chute (-1 ou 0)
            
            if (valor == 0) { // Verifica se não tem bomba
                System.out.println("Tá vivo!!!");
                caminhoMinadoUsuario.set(chute-1, "X ");
                pontos++;
            }
            else { // Verifica se tem bomba
                System.out.println("Game Over");
                break;
            }
                if (chute < caminhoMinado.size() && caminhoMinado.get(chute) == -1) { // Verifica se tem bomba na direita do chute
                    System.out.println("Tem bomba próximo");
                }
                else if (chute > 1 && caminhoMinado.get(chute - 2) == -1) { // Verifica se tem bomba na esquerda do chute
                    System.out.println("Tem bomba próximo");
                }
                
            } 
            
        if(pontos == (caminhoMinado.size() - bomba)){ 
            System.out.println("Você ganhou!");
            for (int i = 0; i < caminhoMinadoUsuario.size(); i++) {
                
            if(caminhoMinadoUsuario.get(i).equals("_ ")){
                caminhoMinadoUsuario.set(i,"B ");
            }
                }
            
                
        }
        System.out.println("Sua pontuação final é " + pontos + " pontos"); // Mostra a pontuação final
        System.out.println("Número de bombas: " + bomba); // Mostra o número de bombas
        System.out.print("Caminho Minado: "); // Mostra o caminho minado final
        for (String string : caminhoMinadoUsuario) {
            System.out.print(string);
        }
            System.out.println("");
        }
    }
}

