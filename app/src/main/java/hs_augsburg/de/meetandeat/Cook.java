package hs_augsburg.de.meetandeat;

import java.util.Date;

public class Cook extends Host {

    String dish, missIngredient, missMass;

    public Cook(int postcode, String city, String description, String tags, Date date, String adress, String title, int ppl_amount, String dish, String missIngredient, String missMass){
        super( postcode, city, description, tags, date, adress, title, ppl_amount);
        this.dish = dish;
        this.missIngredient = missIngredient;
        this.missMass = missMass;
    }

}
