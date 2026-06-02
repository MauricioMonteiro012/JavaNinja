package NivelIntermediario.Desafio;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusDaMissao;

    public void mostrarInformacoes() {
        System.out.println("Ola, meu nome é " + nome + "tenho " + idade + " anos" + ". Minha missao é " + missao + " com o nivel de dificuldade de " + nivelDeDificuldade + "\n Status da Missao: " + statusDaMissao);
    }

}
