package library;

public class Album implements Downloadable {
    private String musician;
    private String name;
    private String availability;

    public String getAvailability() {
        return availability;
    }

    public String getMusician() {
        return musician;
    }

    public String getName() {
        return name;
    }

    public Album(String musician, String name,String availability) {
        this.musician = musician;
        this.name = name;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Album{" +
                "musician='" + musician + '\'' +
                ", name='" + name + '\'' +
                ", availability='" + availability + '\'' +
                '}';
    }

    @Override
    public void download() {
        if(getAvailability() =="downloadable") {
            System.out.println("Downloading...");
        } else {
            System.out.println("Error");
        }
    }
}
