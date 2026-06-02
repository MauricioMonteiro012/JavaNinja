package NivelIntermediario;


public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        // Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();


        // Criar o ninja Sasuke Uchiha - Sasuke é um OBJETO
        // Objeto 2
        Uchiha Sasuke =  new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();
        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Voce tem: " + Sasuke.idade + " anos, então falta no minimo: " + quantoTempoFalta + " anos para se tornar Hokage");

        // Criar Sakura Haruno - Sakura é um OBJETO
        // Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();

        // Criar Hinata Hyuga - Hinata é um OBJETO
        // Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 18;
        Hinata.PoderOcular();




        // Programação Orientada a Objeto - POO
        // 3 Pilares - Herança, Polimorfismo e Encapsulamento

        // HERANÇA - Usar caracteristicas de uma classe mãe em outras classes filhas para assim poupar código e agilizar trabalho.
        // POLIMORFISMO - Criar uma função única que pode ser utilizada em diferentes classes com diferentes caracteristicas.
        // ENCAPSULAMENTO - Capacidade de proteger variaveis e classes para que não  haja vazamento e mantendo assim protegida e encapsulada nossos objetos.



    }
}
