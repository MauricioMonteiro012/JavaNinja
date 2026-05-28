package NivelBasico;

import java.sql.SQLOutput;

public class Array {

    public static void main(String[] args) {
        //Arrays são tipo referencia!

        //String inicializa com NULL
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        System.out.println(ninja);


        //Redeclarar o ARRAY
        ninja = new String[7];
        ninja [0] = "Hashirama Senju";
        ninja [1] = "Tobirama Senju";
        ninja [2] = "Hiruzen Sarutobi";
        ninja [3] = "Minato Namikaze";
        ninja [4] = "Tsunade";
        ninja [5] = "Kakashi Hatake";
        ninja [6] = "Naruto Uzumaki";
        System.out.println(ninja[2]);

        //For para fazer um loop no array

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }






        //Array idade
        //int inincializa como 0
        int [] idade =  new int[2];
        System.out.println(idade[1]);


        //Boolean inicializam como FALSE
        boolean [] verdadeiroOuFalso =  new boolean[2];
        System.out.println(verdadeiroOuFalso[1]);

        //Doubles inicializam como 0.0
        double [] flutuante =  new double[2];
        System.out.println(flutuante[1]);






        //[Ljava.lang.String;@6acbcfc0 - Referencia da memoria que o array está

        //Diferença de Array pra Lista
        //Araay sempre vai ter um tipo definido, tamanho fixo
        //As listas tem tamanho flexiciveis


        //Introdução de Arrays multidimensionais / Arrays 2D
        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias [0][0] = "Konaha";
        ninjasEAldeias [0][1] = "Naruto Uzumaki";
        ninjasEAldeias [0][2] = "Sasuke Uchiha";

        ninjasEAldeias [1][0] = "Nevoa";
        ninjasEAldeias [1][1] = "Zabuza";
        ninjasEAldeias [1][2] = "Haku";

        ninjasEAldeias [2][0] = "Deserto";
        ninjasEAldeias [2][1] = "Gaara";
        ninjasEAldeias [2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] + " - Ninja 1: " + ninjasEAldeias[i][1] + " - Ninja 2: " + ninjasEAldeias[i][2]);
        }

    }

}