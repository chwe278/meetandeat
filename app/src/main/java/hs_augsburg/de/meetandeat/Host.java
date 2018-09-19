package hs_augsburg.de.meetandeat;

import java.util.Date;

public abstract class Host extends Event {

    private String date, address, title, ppl_amount;

    public Host(String postcode, String city, String description, String tags, String date, String address, String title, String ppl_amount){
        super(postcode, city, description, tags);
        this.date = date;
        this.address = address;
        this.title = title;
        this.ppl_amount = ppl_amount;

    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public String getTitle() {
        return title;
    }

    public String getPpl_amount() {
        return ppl_amount;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPpl_amount(String ppl_amount) {
        this.ppl_amount = ppl_amount;
    }
}
