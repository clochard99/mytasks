package library;

public class Album implements Downloadable {
    private String musician;
    private String name;


    public String getMusician() {
        return musician;
    }

    public String getName() {
        return name;
    }

    public Album(String musician, String name) {
        this.musician = musician;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Album{" +
                "musician='" + musician + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void download() {
        System.out.println("Downloading...");
    }
}
