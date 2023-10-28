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

        ArrayList<Integer> caminhoMinado = new ArrayList<>();
        for (int i = 0; i < (num - bomba); i++) {
            caminhoMinado.add(0);
        }
        for (int a = 0; a < bomba; a++) {
            caminhoMinado.add(1);
        }
        Collections.shuffle(caminhoMinado);
        Collections.shuffle(caminhoMinado);
        Collections.shuffle(caminhoMinado);
        for (int i = 0; i < caminhoMinado.size(); i++) {
            System.out.print(" _ ");
        }
        int pontos = 0;
        System.out.println("");
        for (int i = 0; i < (caminhoMinado.size() - bomba); i++) {
            System.out.println("Digite o seu chute entre 1 a " + caminhoMinado.size());
            
            int chute = entrada.nextInt();
            int valor = caminhoMinado.get(chute - 1);
            if (valor == 0) {
                System.out.println("Tá vivo!!!");
                if (chute < caminhoMinado.size() && caminhoMinado.get(chute) == 1) {
                    System.out.println("Tem bomba próximo");
                }
                if (chute > 1 && caminhoMinado.get(chute - 2) == 1) {
                    System.out.println("Tem bomba próximo");
                }
                pontos++;
            } else {
                System.out.println("Morreu pra bomba");
                break;
            }
            
    }
        System.out.println("Sua pontuação final é " + pontos + " pontos");
        }
}

