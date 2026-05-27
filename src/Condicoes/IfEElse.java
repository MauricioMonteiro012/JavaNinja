package Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
         *IF E ELSE - NivelBasico.Condiçoes
         * else if
         * Objetivo: Passar o ninja de nivel de acordo com o numeor de missoes
         */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 9;

        /*
        * if (condiçao) { resultado }
        * else if (condiçao) { resultado }
        * else { resultado caso nada seja verdadeiro }
         */

        //se (condiçao) {faça isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}


