package hs_augsburg.de.meetandeat;

import java.sql.Date;
import java.util.ArrayList;

public class StartEvent {

    ArrayList<Event> EventList;

    public StartEvent(){

        EventList = new ArrayList<>();
        Cook cook = new Cook(86150, "Augsburg", "I would like to have a typical swabian dinner with you.",
                "#schwäbisch", Date.valueOf("2018-10-10"), "Maxstraße 1", "Schwäbisches Abendessen", 4,
                "Kässpätzle", "Flour", "500g");

    }

    public ArrayList<Event> getEventList() {
        return EventList;
    }
}
