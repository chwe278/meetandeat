package hs_augsburg.de.meetandeat;

public class Guest extends Event {

   private String avaIngredients, avaMass;


    public Guest (String postcode, String city, String description, String tags, String avaIngredients, String avaMass){
        super(postcode, city, description, tags);
        this.avaIngredients = avaIngredients;
        this.avaMass = avaMass;

    }

    public String getAvaIngredients() {
        return avaIngredients;
    }

    public String getAvaMass() {
        return avaMass;
    }

    public void setAvaIngredients(String avaIngredients) {
        this.avaIngredients = avaIngredients;
    }

    public void setAvaMass(String avaMass) {
        this.avaMass = avaMass;
    }
}
