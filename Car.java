/**
 * car
 * 
 * there are parivate parameters[
 * id, company, name, type, date-of-create, year
 * ],
 * Getter and methods of all parameters
 */



 
public class Car {
    private int id;
    private String company;
    private String name;
    private String type;
    private String date_of_create;
    private String year;


    public Car(int id, String company, String name, String type, String date_of_create, String year) {
        this.id = id;
        this.company = company;
        this.name = name;
        this.type = type;
        this.date_of_create = date_of_create;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "Car [company=" + company + ", date_of_create=" + date_of_create + ", id=" + id + ", name=" + name
                + ", type=" + type + ", year=" + year + "]";
    }

    //Getter and setter functions
  
    public void setId(int id) {
        this.id = id;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setDate_of_create(String date_of_create) {
        this.date_of_create = date_of_create;
    }
    public void setYear(String year) {
        this.year = year;



    }
    public int getId() {
        return id;
    }
    public String getCompany() {
        return company;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getDate_of_create() {
        return date_of_create;
    }
    public String getYear() {
        return year;
    }
}