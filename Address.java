/**
 * address
 * 
 * there are parivate parameters[
 * id, company, name, type, date-of-create, year
 * ],
 * Getter and methods of all parameters
 */



 
public class address {
    private int id;
    private String city;
    private String state;
    private String postalCode;
    private String Country;
    private String Personld;
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "address [Country=" + Country + ", Personld=" + Personld + ", city=" + city + ", id=" + id + ", postal="
                + postal + ", state=" + state + "]";
    }
    public address(int id, String city, String state, String postal, String country, String personld) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.postal = postal;
        Country = country;
        Personld = personld;
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
    public String getPostal() {
        return postal;
    }
    public void setPostal(String postal) {
        this.postal = postal;
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
    
  