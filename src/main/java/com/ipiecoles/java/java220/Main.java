package com.ipiecoles.java.java220;

import com.ipiecoles.java.java220.Client;

public class Main {
    public static void main(String[] args) {
        //Déclaration de String
        String maChaine = "Bonjour";
        //Afficher maChaine
        System.out.println(maChaine);
        maChaine = "Au revoir";
        //Afficher maChaine
        System.out.println(maChaine);
        maChaine = null;
        //Afficher maChaine
        System.out.println(maChaine);
        //Variable déclarée mais non initialisée
        Client c;
        //Instanciation d'un object c à partir de la classe Client
        c = new Client();
        c.nom = "Durand";
        c.prenom = "Jean";
        c.numero = 123456;
        System.out.println(c.calculReduction());
        Client c2 = new Client();
        c2.nom = "Dupont";
        c2.prenom = "Christine";
        c2.numero = 654321;
        System.out.println(c2.calculReduction());
        System.out.println("Nom C : " + c.nom);
        System.out.println("Prénom C : " + c.prenom);
        System.out.println("Numéro C : " + c.numero);
        System.out.println("Nom C2 : " + c2.nom);
        System.out.println("Prénom C2 : " + c2.prenom);
        System.out.println("Numéro C2 : " + c2.numero);
    }
}