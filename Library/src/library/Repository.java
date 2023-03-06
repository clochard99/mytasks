package library;

import java.util.HashMap;
import java.util.Map;

public class Repository {

    private Map<String,Book> books = new HashMap<>();
    private Map<String,EBook> ebooks = new HashMap<>();
    private Map<String,Album> albums = new HashMap<>();

    Repository() {
        books.put("The Great Gatsby",new Book("The Great Gatsby","F. Scott Fitzgerald","",false));
        books.put("Jane Eyre",new Book("Jane Eyre","Charlotte Bronte","",true));
        books.put("Wuthering Heights",new Book("Wuthering Heights","Emily Brontë","",true));
        books.put("Moby Dick",new Book ("Moby Dick","Herman Melville","",true));
        ebooks.put("Robison Crusoe",new EBook("Robison Crusoe","Daniel Defoe",""));
        ebooks.put("Little Women",new EBook("Little Women", "Louisa May Alcott", ""));
        ebooks.put("Alice in Wonderland", new EBook("Alice in Wonderland","Lewis Carroll",""));
        albums.put("Long Ambients Two",new Album("Moby","Long Ambients Two"));
        albums.put("Dadamah",new Album("Dadamah", "This is not a Dream"));
        albums.put("Everything is Wrong",new Album("Moby","Everything is Wrong"));
        albums.put("Hella Brown Metal", new Song("Hella","Brown Metal"));
    }
    public Book getBook(String title) {
        return books.get(title);
    }

    public EBook getEbook(String title) {
        return ebooks.get(title);
    }
    public Album getAlbum(String name) {
        return albums.get(name);
    }

}
