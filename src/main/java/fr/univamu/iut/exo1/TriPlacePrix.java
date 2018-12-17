package fr.univamu.iut.exo1;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TriPlacePrix implements TriPlace {
    private ComparatorPrix comparatorPrix = new ComparatorPrix();
    private TreeSet <Place> treeSet = new TreeSet<>(comparatorPrix);

    @Override
    public TreeSet<Place> trierPlace(ArrayList<Place> places) {
        ArrayList<Place> placeLibre;
        placeLibre = places;
        for (Place p : placeLibre) {
            if (p.estLibre()) {
                treeSet.add(p);
            }
        }
        return treeSet;
    }
}
