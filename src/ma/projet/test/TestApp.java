package ma.projet.test;

import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {

    public static void main(String[] args) {

        // Création des catégories
        Categorie portable = new Categorie("Ordinateur Portable", "O PR");
        Categorie poste = new Categorie("Ordinateur Poste", "O PO");

        // Tableau des catégories
        Categorie[] categories = {portable, poste};

        // Création des articles
        Article a1 = new Article(14, "DELL INSPIRON", portable);
        Article a2 = new Article(4, "SONY VAIO", portable);
        Article a3 = new Article(74, "TERRA", poste);
        Article a4 = new Article(785, "HP Compaq", poste);

        // Tableau des articles
        Article[] articles = {a1, a2, a3, a4};

        // Affichage des articles par catégorie
        for (int i = 0; i < categories.length; i++) {

            System.out.println(categories[i].getLibelle() + " :");

            for (int j = 0; j < articles.length; j++) {

                if (articles[j].getCategorie().getId() == categories[i].getId()) {
                    System.out.println("  - " + articles[j]);
                }
            }

            System.out.println();
        }
    }
}

