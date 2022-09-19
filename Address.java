/**
 * address
 *   
 * there are parivate parameters[
 * id, company, name, type, date-of-create, year
 * ],
 * Getter and methods of all parameters
 */

import java.util.ArrayList;

 
public class Address {
    private int id;
    private String city;
    private String state;
    private String postalCode;
    private String Country;
    private String Personld;
    
    public static ArrayList<Address> addresss = new ArrayList<>();




    

    public Address(int id, String city, String state, String postalCode, String country, String personld) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.Country = country;
        this.Personld = personld;

    }
    

    @Override
    public String toString() {
        return "Address [Country=" + Country + ", Personld=" + Personld + ", addresss=" + addresss + ", city=" + city
                + ", id=" + id + ", postalCode=" + postalCode + ", state=" + state + "]";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getPersonld() {
        return Personld;
    }

    public void setPersonld(String personld) {
        Personld = personld;
    }





}
    
  