package hs_augsburg.de.meetandeat;

import java.util.ArrayList;

public class StartEvent {

    private ArrayList<Event> hostEventList;

    public StartEvent(){
        hostEventList = new ArrayList<>();
    }

    public ArrayList<Event> getEventList() {
        return hostEventList;
    }
}
