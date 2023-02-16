package jogodavelha;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        int posicao, cont = 0;
        boolean validado, fimdejogo;
        
        Scanner leia = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        
        jogo.zerarTabuleiro();
        do {
            cont++;
            jogo.mostrarTabuleiro();
            
            if (cont % 2 == 1){
                System.out.println("Jogador 1 - Escolha um numero referente a posicao que deseja jogar:");
            } else {
                System.out.println("Jogador 2 - Escolha um numero referente a posicao que deseja jogar:");
            }
            
            do {
                posicao = leia.nextInt();
                validado = jogo.verificarPosicao(posicao);
                if (validado == false) {
                    System.out.println("Está posição já esta ocupada, por favor, escolha outra!");
                }
            } while (validado == false);
            
            if (cont % 2 == 1){
                jogo.fazerMovimento(posicao, jogo.getJogador1());
            } else {
                jogo.fazerMovimento(posicao, jogo.getJogador2());
            }
            
            fimdejogo = jogo.verificarPartida();
            if (fimdejogo == true){
                if (cont % 2 == 1){
                    System.out.println("Jogador 1 venceu!");
                } else {
                    System.out.println("Jogador 2 venceu!");
                }
                cont = 10;
            }
            
        } while (cont < 9);
        if (fimdejogo == false){
            System.out.println("Empate, ninguem venceu!");
        }
        jogo.mostrarTabuleiro();
    }
}
