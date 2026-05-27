package TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {
        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 14;
        String nomeDaMissao1 = "Time 7 escolta do Tazuna (País das Ondas)";
        char nivelDeDificuldade1 = 'S';
        String statusDaMissao1 = "Em andamento";

        // Verificar nivel da missao e idade do ninja
        if (idadeNinja1 < 15) {
            if (nivelDeDificuldade1 == 'C' || nivelDeDificuldade1 == 'D') {
                statusDaMissao1 = "Concluida";
            } else {
                statusDaMissao1 = "Não concluida, idade insuficiente.";
            }
        } else {
            statusDaMissao1 = "Concluida";
        }

        System.out.println("-".repeat(40));
        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idadeNinja1);
        System.out.println("Missão do ninja: " + nomeDaMissao1);
        System.out.println("Dificuldade da missão: " + nivelDeDificuldade1);
        System.out.println("Status da missão: " + statusDaMissao1);
        System.out.println("-".repeat(40));

        // Ninja 2
        String nomeNinja2 = "Kakashi Hatake";
        int idadeNinja2 = 18;
        String nomeDaMissao2 = "Exame Chunin (Floresta da Morte e combates)";
        char nivelDeDificuldade2 = 'B';
        String statusDaMissao2 = "Em andamento";

        if (idadeNinja2 < 15) {
            if (nivelDeDificuldade2 == 'C' || nivelDeDificuldade2 == 'D') {
                statusDaMissao2 = "Concluida";
            }  else {
                statusDaMissao2 = "Não concluida, idade insuficiente.";
            }
        } else {
            statusDaMissao2 = "Concluida";
        }

        System.out.println("-".repeat(40));
        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idadeNinja2);
        System.out.println("Missão do ninja: " + nomeDaMissao2);
        System.out.println("Dificuldade da missão: " + nivelDeDificuldade2);
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("-".repeat(40));


        // Ninja3
        String nomeNinja3 = "Itachi Uchiha";
        int idadeNinja3 = 18;
        String nomeDaMissao3 = "Missão de resgate do Sasuke";
        char nivelDeDificuldade3 = 'A';
        String statusDaMissao3 = "Concluido";

        if (idadeNinja3 < 15) {
            if (nivelDeDificuldade3 == 'C' || nivelDeDificuldade3 == 'D') {
                statusDaMissao3 = "Concluida";
            } else {
                statusDaMissao3 = "Não concluida, idade insuficiente.";
            }
        } else {
            statusDaMissao3 = "Concluida";
        }

        System.out.println("-".repeat(40));
        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idadeNinja3);
        System.out.println("Missão do ninja: " + nomeDaMissao3);
        System.out.println("Dificuldade da missão: " + nivelDeDificuldade3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("-".repeat(40));

    }
}
