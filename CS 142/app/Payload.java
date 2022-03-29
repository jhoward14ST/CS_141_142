package app;

public class Payload implements Comparable<Payload> {

    private final String name;
    private final String type;
    private final double mass;
    private final String orbit;

    public static int compareMasses(Payload first, Payload second) {
        return Double.compare(first.getMass(), second.getMass());
    }

    public static int compareNames(Payload first, Payload second) {
        return CharSequence.compare(first.getName(), second.getName());
    }

    public double getMass() {
        return mass;
    }

    public String getName() {return name;}

    public Payload(){
        this(null, null, 0, null);
    }

    public Payload(String name, String type, double mass, String orbit){
        this.name = name;
        this.type = type;
        this.mass = mass;
        this.orbit = orbit;
    }

    //@Override
    public int compareTo(Payload other) {
        if(!name.equals(other.name)) {
            return name.compareTo(other.name);
        } else if(mass != other.mass) {
            return Double.compare(mass, other.mass);
        } else if(!type.equals(other.type)) {
            return type.compareTo(other.type);
        }
        return orbit.compareTo(other.orbit);
    }

    public boolean equals(Object obj){
        if(obj instanceof Payload){
            Payload other = (Payload) obj;
            return  name.equals(other.name) &&
                    type.equals(other.type) &&
                    mass == other.mass &&
                    orbit.equals(other.orbit);
        }
            return false;
    }

    String formatCSV(String s){
        if (s.isBlank() || s.equals("Unknown")){
            return ",";
        }
        return s + ",";
    }
    public String toCSVFormat(){
        return formatCSV(name + " " + type + " " + mass + " " + orbit);
    }

    public String toString() {
        return name + " " + type + " " + mass + " " + orbit;
    }
}
