package com.example.tp;

public class MainEx4 {

    public static void main(String[] args) {

        // Création des auteurs
        Auteur hugo = new Auteur("Victor Hugo");
        Auteur orwell = new Auteur("George Orwell");

        // Création des livres
        Livre m1 = new Livre("Les Misérables", hugo);
        Livre ndp = new Livre("Notre-Dame de Paris", hugo);
        Livre l1984 = new Livre("1984", orwell);

        // Création des bibliothèques
        Bibliotheque centrale = new Bibliotheque("Centrale");
        Bibliotheque quartier = new Bibliotheque("Quartier");

        // Associations bibliothèque ↔ livres
        centrale.ajouterLivre(m1);
        centrale.ajouterLivre(l1984);

        quartier.ajouterLivre(m1);
        quartier.ajouterLivre(ndp);

        // Affichage des auteurs et leurs livres
        System.out.println(hugo);

        for (Livre livre : hugo.getLivres()) {
            System.out.println("  • " + livre);
        }

        System.out.println(orwell);

        for (Livre livre : orwell.getLivres()) {
            System.out.println("  • " + livre);
        }

        // Affichage des bibliothèques
        System.out.println(centrale);

        for (Livre livre : centrale.getCollection()) {
            System.out.println("  – " + livre.getTitre() +
                               " (id=" + livre.getId() + ")");
        }

        System.out.println(quartier);

        for (Livre livre : quartier.getCollection()) {
            System.out.println("  – " + livre.getTitre() +
                               " (id=" + livre.getId() + ")");
        }
    }
}

