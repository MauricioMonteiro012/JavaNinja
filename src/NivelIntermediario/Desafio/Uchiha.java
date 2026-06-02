package NivelIntermediario.Desafio;

public class Uchiha extends Ninja {

    String habilidadeEspecial = "Hokage Ativado";

    @Override
    public void mostrarInformacoes() {
        System.out.println("Ola, meu nome é " + nome + " tenho " + idade + " anos" + ". Minha missao é " + missao + " com o nivel de dificuldade de " + nivelDeDificuldade + "\n Status da Missao: " + statusDaMissao + "\n Habilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println(habilidadeEspecial);
    }

}
