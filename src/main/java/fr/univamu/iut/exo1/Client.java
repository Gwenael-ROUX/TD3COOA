package fr.univamu.iut.exo1;

public class Client {
    public static void main(String[] args) {
        Expression expression = new NoeudInterne(new Nombre(2),new Nombre(5),'+');
        Expression expression2 = new NoeudInterne(new Nombre(expression.calculerValeur()),new Nombre(3),'*');
        System.out.println(expression2.calculerValeur());
    }
}
