package library;

public class EBook extends Book implements Downloadable {

    public EBook(String title, String author, String content, boolean availability) {
        super(title, author, content, availability);
    }

    @Override
    public void download() {
        if(isAvailability()) {
            System.out.println("Downloading...");
        } else {
            System.out.println("Error");
        }
    }
    EBook() {

    }
}
