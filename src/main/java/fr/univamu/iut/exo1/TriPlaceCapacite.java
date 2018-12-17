package fr.univamu.iut.exo1;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TriPlaceCapacite implements TriPlace {
    private ComparatorCapacite comparatorCapacite = new ComparatorCapacite();
    private TreeSet<Place> treeSet = new TreeSet<>(comparatorCapacite);

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
