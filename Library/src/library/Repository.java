package library;

import java.util.HashMap;
import java.util.Map;

public class Repository {

    Map<String,Book> books = new HashMap<>();
    Map<String,EBook> ebooks = new HashMap<>();
    Map<String,Album> albums = new HashMap<>();
    private Book book1 = books.put("The Great Gatsby",new Book("The Great Gatsby","F. Scott Fitzgerald","",false));
    private Book book2 = books.put("Jane Eyre",new Book("Jane Eyre","Charlotte Bronte","",true));
    private Book book3 = books.put("Wuthering Heights",new Book("Wuthering Heights","Emily Brontë","",true));
    private Book book4 = books.put("Moby Dick",new Book ("Moby Dick","Herman Melville","",true));
    private EBook ebook1 = ebooks.put("Robison Crusoe",new EBook("Robison Crusoe","Daniel Defoe","",true));
    private EBook ebook2 = ebooks.put("Little Women",new EBook("Little Women", "Louisa May Alcott", "", true));
    private Album album = albums.put("Long Ambients Two",new Album("Moby","Long Ambients Two", "downloadable"));
    private Album album1 =albums.put("Dadamah",new Album("Dadamah", "This is not a Dream","unloaded"));
    private Album album2 = albums.put("Everything is Wrong",new Album("Moby","Everything is Wrong", "unloaded"));
    private Album song1 = albums.put("Hella Brown Metal", new Song("Hella","Brown Metal","downloadable"));


}
