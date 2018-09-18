package hs_augsburg.de.meetandeat;

import java.util.Date;

public abstract class Host extends Event {

    Date date;
    String adress, title;
    int ppl_amount;

    public Host(int postcode, String city, String description, String tags, Date date, String adress, String title, int ppl_amount){
        super(postcode, city, description, tags);
        this.date = date;
        this.adress = adress;
        this.title = title;
        this.ppl_amount = ppl_amount;

    }

    //date, adress, ppl, title
}
