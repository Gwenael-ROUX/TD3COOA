package fr.univamu.iut.exo1;

import java.util.Comparator;

public class ComparatorPrix implements Comparator <Place> {
    @Override
    public int compare(Place o1, Place o2) { return (int)(o1.getCoutJour() - o2.getCoutJour());}
}
