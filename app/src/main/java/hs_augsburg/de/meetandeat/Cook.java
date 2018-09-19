package hs_augsburg.de.meetandeat;

import java.util.Date;

public class Cook extends Host {

    private String dish, missIngredient, missMass;

    public Cook(String postcode, String city, String description, String tags, String date, String address, String title, String ppl_amount, String dish, String missIngredient, String missMass){
        super( postcode, city, description, tags, date, address, title, ppl_amount);
        this.dish = dish;
        this.missIngredient = missIngredient;
        this.missMass = missMass;
    }

    public String getDish() {
        return dish;
    }

    public String getMissIngredient() {
        return missIngredient;
    }

    public String getMissMass() {
        return missMass;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public void setMissIngredient(String missIngredient) {
        this.missIngredient = missIngredient;
    }

    public void setMissMass(String missMass) {
        this.missMass = missMass;
    }
}
