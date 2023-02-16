package jogodavelha;

public class JogoDaVelha {
    private String[][] tabuleiro = new String[3][3];
    private String jogador1 = "O", jogador2 = "X";

    public JogoDaVelha() {}

    public JogoDaVelha(String jogador1, String jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }
    
    public void fazerMovimento(int posicao, String jogador){
        int cont = 0;
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                cont++;
                if (posicao == cont) {
                    this.tabuleiro[i][j] = jogador;
                }
            }
        }
    }
    
    public void zerarTabuleiro(){
        int cont = 0;
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                cont++;
                this.tabuleiro[i][j] = String.valueOf(cont);
            }
        }
    }
    
    public void mostrarTabuleiro(){
        String posicoes = " ";
        int cont = 0;
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                cont++;
                if ((cont == 3) || (cont == 6)){
                    posicoes = posicoes + this.tabuleiro[i][j] + " \n-----------\n ";
                } else if (cont == 9) {
                    posicoes = posicoes + this.tabuleiro[i][j] + " \n ";
                } else {
                    posicoes = posicoes + this.tabuleiro[i][j] + " | ";
                }
            }
        }
        System.out.printf(posicoes);
    }
    
    public boolean verificarPartida(){
        boolean verif = false;
        //verificações do jogador 1
        if ( (this.tabuleiro[0][0].equals(this.jogador1)) &&
                (this.tabuleiro[0][1].equals(this.jogador1)) &&
                (this.tabuleiro[0][2].equals(this.jogador1))) {
            verif = true;
        } else if ( (this.tabuleiro[1][0].equals(this.jogador1)) &&
                (this.tabuleiro[1][1].equals(this.jogador1)) &&
                (this.tabuleiro[1][2].equals(this.jogador1))) {
            verif = true;
        } else if ( (this.tabuleiro[2][0].equals(this.jogador1)) &&
                (this.tabuleiro[2][1].equals(this.jogador1)) &&
                (this.tabuleiro[2][2].equals(this.jogador1))) {
            verif = true;
        } else if ( (this.tabuleiro[0][0].equals(this.jogador1)) &&
                (this.tabuleiro[1][0].equals(this.jogador1)) &&
                (this.tabuleiro[2][0].equals(this.jogador1))) {
            verif = true;
        } else if ( (this.tabuleiro[0][1].equals(this.jogador1)) &&
                (this.tabuleiro[1][1].equals(this.jogador1)) &&
                (this.tabuleiro[2][1].equals(this.jogador1))) {
            verif = true;
        } else if ( (this.tabuleiro[0][2].equals(this.jogador1)) &&
                (this.tabuleiro[1][2].equals(this.jogador1)) &&
                (this.tabuleiro[2][2].equals(this.jogador1))) {
            verif = true;
        } else if ( (this.tabuleiro[0][0].equals(this.jogador1)) &&
                (this.tabuleiro[1][1].equals(this.jogador1)) &&
                (this.tabuleiro[2][2].equals(this.jogador1))) {
            verif = true;
        } else if ( (this.tabuleiro[0][2].equals(this.jogador1)) &&
                (this.tabuleiro[1][1].equals(this.jogador1)) &&
                (this.tabuleiro[2][0].equals(this.jogador1))) {
            verif = true;
        //verificações do jogador 2
        } else if ( (this.tabuleiro[0][0].equals(this.jogador2)) &&
                (this.tabuleiro[0][1].equals(this.jogador2)) &&
                (this.tabuleiro[0][2].equals(this.jogador2))) {
            verif = true;
        } else if ( (this.tabuleiro[1][0].equals(this.jogador2)) &&
                (this.tabuleiro[1][1].equals(this.jogador2)) &&
                (this.tabuleiro[1][2].equals(this.jogador2))) {
            verif = true;
        } else if ( (this.tabuleiro[2][0].equals(this.jogador2)) &&
                (this.tabuleiro[2][1].equals(this.jogador2)) &&
                (this.tabuleiro[2][2].equals(this.jogador2))) {
            verif = true;
        } else if ( (this.tabuleiro[0][0].equals(this.jogador2)) &&
                (this.tabuleiro[1][0].equals(this.jogador2)) &&
                (this.tabuleiro[2][0].equals(this.jogador2))) {
            verif = true;
        } else if ( (this.tabuleiro[0][1].equals(this.jogador2)) &&
                (this.tabuleiro[1][1].equals(this.jogador2)) &&
                (this.tabuleiro[2][1].equals(this.jogador2))) {
            verif = true;
        } else if ( (this.tabuleiro[0][2].equals(this.jogador2)) &&
                (this.tabuleiro[1][2].equals(this.jogador2)) &&
                (this.tabuleiro[2][2].equals(this.jogador2))) {
            verif = true;
        } else if ( (this.tabuleiro[0][0].equals(this.jogador2)) &&
                (this.tabuleiro[1][1].equals(this.jogador2)) &&
                (this.tabuleiro[2][2].equals(this.jogador2))) {
            verif = true;
        } else if ( (this.tabuleiro[0][2].equals(this.jogador2)) &&
                (this.tabuleiro[1][1].equals(this.jogador2)) &&
                (this.tabuleiro[2][0].equals(this.jogador2))) {
            verif = true;
        }
        return verif;
    }
    
    public boolean verificarPosicao(int posicao){
        int cont = 0;
        boolean verif = false;
        for (int i=0; i < 3; i++){
            for (int j=0; j < 3; j++){
                cont++;
                if (posicao == cont) {
                    if (this.tabuleiro[i][j].equals(this.jogador1) || this.tabuleiro[i][j].equals(this.jogador2)){
                        verif = false;
                    } else {
                        verif = true;
                    }
                }
            }
        }
        return verif;
    }

    public String[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public String getJogador1() {
        return jogador1;
    }

    public void setJogador1(String jogador1) {
        this.jogador1 = jogador1;
    }

    public String getJogador2() {
        return jogador2;
    }

    public void setJogador2(String jogador2) {
        this.jogador2 = jogador2;
    }
    
}
