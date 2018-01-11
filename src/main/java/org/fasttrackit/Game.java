package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Rescuer rescuer;
    Dog dog;
    DogFood dogFood;
    Vet vet;

private List<DogFood> competitorList = new ArrayList<DogFood>();
private EntertainmentActivity[]competitors = new EntertainmentActivity[7];

private void initDogFood() {


}

    public List<DogFood> getCompetitorList() {
        return competitorList;
    }

    public EntertainmentActivity[] getCompetitors() {
        return competitors;
    }
}
