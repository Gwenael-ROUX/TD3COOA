package fr.univamu.iut.exo1;

import java.util.Comparator;

public class ComparatorCapacite implements Comparator <Place> {
    @Override
    public int compare(Place o1, Place o2) { return (int)(o2.getCapacite() - o1.getCapacite()); }
}
