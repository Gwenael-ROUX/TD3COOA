package fr.univamu.iut.exo2;

public class Client {
    public ArbreBinaire feuille (String mot){
        return new ArbreBinaire<String>(null,null,mot);
    }

    public ArbreBinaire noeudInterne(ArbreBinaire a1, String mot, ArbreBinaire a2){
        ArbreBinaire<String> arbre = new ArbreBinaire<String>(a1,a2,mot);
    }

    public static void main(String[] args) {

    }
}
