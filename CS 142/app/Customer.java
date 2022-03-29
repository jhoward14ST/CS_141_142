package app;

public class Customer {
    private final String name;
    private final String type;
    private final String country;

    public Customer() {
        this(null, null, null);
    }
    public Customer(String name, String type, String country) {
        this.name = name;
        this.type = type;
        this.country = country;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Customer){
            Customer other = (Customer) obj;
            return  name == other.name &&
                    type == other.type &&
                    country == other.country;
        }
        return false;
    }

    public String toCSVFormat() {
        return name + ", " + type + ", " + country;
    }
    public String toString() {
        return name + " " + type + " " + country;
    }
}
