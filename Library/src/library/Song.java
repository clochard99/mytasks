package library;

public class Song extends Album {

    public Song(String musician, String name, String availability) {
        super(musician, name, availability);
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
