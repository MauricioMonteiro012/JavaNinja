package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        //Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo Java

            /*
            * Dados nao primitivos: String, Array, Class, enum
            * Objetivo da aula: Criar um ninja, e atribuir métodos a ele.
             */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();//ToUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse nome está em CAPSLOCK: " + nomeUpperCase);
        System.out.println("Esse nome está normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaLowerCase = aldeia.toLowerCase();//toLowerCase vai colocar tudo em caixa baixa/minusculo
        System.out.println(aldeiaLowerCase);
    }
}


/*
* 1) Dados Primitivos: Sao tipos de dados que de maneira geral nao recebem metodos de maniera padrao
*
* 2) Dados Nao Primitivos: Sao tipos de dados em que pode-se colocar metodos para fazer alteraçoes na variavel sem que seja mudado seu escopo
 */