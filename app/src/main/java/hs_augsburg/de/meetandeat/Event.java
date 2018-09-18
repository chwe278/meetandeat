package hs_augsburg.de.meetandeat;

public abstract class Event {

    int postcode;
    String city, description, tags;     //ggf. nur tag

    public Event(int postcode, String city, String description, String tags){
        this.postcode = postcode;
        this.city = city;
        this.description = description;
        this.tags = tags;

    }

}
