package hs_augsburg.de.meetandeat;

public abstract class Event {

    private String postcode, city, description, tags;     //ggf. nur tag

    public Event(String postcode, String city, String description, String tags){
        this.postcode = postcode;
        this.city = city;
        this.description = description;
        this.tags = tags;

    }

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public String getTags() {
        return tags;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
