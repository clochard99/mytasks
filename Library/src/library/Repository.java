package library;

import java.util.HashMap;
import java.util.Map;

public class Repository {

    public Map<String,Book> books;
    public Map<String,EBook> ebooks;
    public Map<String,Album> albums;

    Repository(Book book) {
        books = new HashMap<>();
        books.put("The Great Gatsby",new Book("The Great Gatsby","F. Scott Fitzgerald","",false));
        books.put("Jane Eyre",new Book("Jane Eyre","Charlotte Bronte","",true));
        books.put("Wuthering Heights",new Book("Wuthering Heights","Emily Brontë","",true));
        books.put("Moby Dick",new Book ("Moby Dick","Herman Melville","",true));
    }
    Repository(EBook ebook) {
        ebooks = new HashMap<>();
        ebooks.put("Robison Crusoe",new EBook("Robison Crusoe","Daniel Defoe","",true));
        ebooks.put("Little Women",new EBook("Little Women", "Louisa May Alcott", "", true));
    }

    Repository(Album album) {
        albums = new HashMap<>();
        albums.put("Long Ambients Two",new Album("Moby","Long Ambients Two", "downloadable"));
        albums.put("Dadamah",new Album("Dadamah", "This is not a Dream","unloaded"));
        albums.put("Everything is Wrong",new Album("Moby","Everything is Wrong", "unloaded"));
        albums.put("Hella Brown Metal", new Song("Hella","Brown Metal","downloadable"));
    }




}
