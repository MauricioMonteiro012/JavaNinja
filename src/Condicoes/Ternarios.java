package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: Sao maneiras de reduzir o codigo
        * variavel = {condiçao} ? valorSerVerdadeiro : valorSerFalso;
         */

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivelDoNinja);
    }
}
