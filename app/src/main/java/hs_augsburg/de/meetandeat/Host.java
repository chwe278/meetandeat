package hs_augsburg.de.meetandeat;

import java.util.Date;

public abstract class Host extends Event {

    String date;
    String adress, title;
    String ppl_amount;

    public Host(String postcode, String city, String description, String tags, String date, String adress, String title, String ppl_amount){
        super(postcode, city, description, tags);
        this.date = date;
        this.adress = adress;
        this.title = title;
        this.ppl_amount = ppl_amount;

    }

    //date, adress, ppl, title
}
