package library;

public class EBook extends Book implements Downloadable {
    public EBook(String title, String author, String content) {
        super(title, author, content);
    }

    @Override
    public void download() {
        System.out.println("Downloading...");
    }
}
