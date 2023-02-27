package library;

public class Book {

    private String title;
    private String author;
    private String content;
    private boolean availability;

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String title, String author, String content, boolean availability) {
        this.title = title;
        this.author = author;
        this.content = content;
        this.availability=availability;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}