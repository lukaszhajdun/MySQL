package pl.sda.day8.zad1;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-06.
 */
public class Trip {
    private ArrayList<Place> route = new ArrayList<>();

    public void addPlace(Place place) {
        route.add(place);
    }

    public void removePlace(Place place) {
        route.remove(place);
    }

    public void setPlace(int index, Place place) {
        if (index >= route.size()) {
            addPlace(place);
        } else {
            route.set(index, place);
        }

    }

    public int calculateDuration() {
        int sum = 0;
        for (Place place : route) {
            sum += place.getDuration();
        }
        return sum;

    }

    public void printRoude() {
        for (Place place : route) {
            System.out.println(place);
        }
    }


}
