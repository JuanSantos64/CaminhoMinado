package javaapplication2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author juans
 */
public class jogo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tamanho do seu caminho minado");
        int num = entrada.nextInt();
        System.out.println("Digite o numero de bombas");
        int bomba = entrada.nextInt();
        if(num > 1 && bomba > 1){
        ArrayList<Integer> caminhoMinado = new ArrayList<>();
        for (int i = 0; i < (num - bomba); i++) {
            caminhoMinado.add(0);
        }
        for (int a = 0; a < bomba; a++) {
            caminhoMinado.add(-1);
        }
        Collections.shuffle(caminhoMinado);
        Collections.shuffle(caminhoMinado);
        Collections.shuffle(caminhoMinado);
        ArrayList<String> caminhoMinadoUsuario = new ArrayList<>();
            for (Integer caminhoMinado1 : caminhoMinado) {
                caminhoMinadoUsuario.add("_ ");
            }
        
        int pontos = 0;
        System.out.println("");
        for (int i = 0; i < (caminhoMinado.size() - bomba); i++) {
            for (String string : caminhoMinadoUsuario) {
                System.out.print(string);
            }
            for (int j = 0; j < caminhoMinado.size(); j++) {
                System.out.print(caminhoMinado.get(j));
            }
            System.out.println("");
            System.out.println("Digite o seu chute entre 1 a " + caminhoMinado.size());
            
            int chute = entrada.nextInt();
            if(caminhoMinadoUsuario.get(chute-1).equals("X ")){
                System.out.println("Você não me engana, você tentou digitar o mesmo número pra acumular pontos, agora você perdeu...");
                System.out.println("Game Over");
                break;
            }
                
            int valor = caminhoMinado.get(chute - 1);
            
            if (valor == 0) {
                System.out.println("Tá vivo!!!");
                caminhoMinadoUsuario.set(chute-1, "X ");
                pontos++;
            }
            else {
                System.out.println("Game Over");
                break;
            }
                if (chute < caminhoMinado.size() && caminhoMinado.get(chute) == -1) {
                    System.out.println("Tem bomba próximo");
                }
                else if (chute > 1 && caminhoMinado.get(chute - 2) == -1) {
                    System.out.println("Tem bomba próximo");
                }
                
            } 
            
        if(pontos == (caminhoMinado.size() - bomba)){
            System.out.println("Você ganhou!");
        }
        System.out.println("Sua pontuação final é " + pontos + " pontos");
        System.out.println("Número de bombas: " + bomba);
        System.out.print("Caminho Minado: ");
        for (String string : caminhoMinadoUsuario) {
            System.out.print(string);
        }
            System.out.println("");
        }
    }
}

