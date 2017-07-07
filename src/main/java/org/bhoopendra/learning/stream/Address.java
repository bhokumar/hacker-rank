package org.bhoopendra.learning.stream;

/**
 * Created by bhokumar on 7/7/2017.
 */
public class Address {
    private String city;
    private String state;
    private int streetNumber;

    public Address(String city, String state, int streetNumber) {
        this.city = city;
        this.state = state;
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

   /* public boolean equals(Object obj){
        if(this==obj)
            return true;
        if (obj==null)
            return false;
        if (!(obj instanceof Address))
            return false;
        Address address = (Address) obj;
        if(address.city == null && city!=null) {
            return false;
        }
        if(!(address.city.equals(city))){
            return false;
        }
        if(address.state == null && state!=null){
            return false;
        }
        if (!(address.state.equals(state))){
            return false;
        }
        if(address.streetNumber!=streetNumber)
            return false;
        return true;
    }

    public int hashCode(){
        int hash = 37;
        hash = hash+city.hashCode()+ state.hashCode();
        hash = hash+hash^streetNumber;
        return hash;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (streetNumber != address.streetNumber) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        return state != null ? state.equals(address.state) : address.state == null;

    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + streetNumber;
        return result;
    }
}
