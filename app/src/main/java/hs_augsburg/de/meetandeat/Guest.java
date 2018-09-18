package hs_augsburg.de.meetandeat;

public class Guest extends Event {

    String avaIngredients, avaMass;


    public Guest (int postcode, String city, String description, String tags, String avaIngredients, String avaMass){
        super(postcode, city, description, tags);
        this.avaIngredients = avaIngredients;
        this.avaMass = avaMass;

    }


}
