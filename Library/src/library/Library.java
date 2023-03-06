package library;

import library.Librarian;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.getEBook("Little Women").download();
        librarian.getEBook("Alice in Wonderland").download();
        //librarian.getEBook("Hey");
        librarian.getAlbum("Long Ambients Two").download();
        //librarian.getSong("Brown Metal");
        librarian.getSong("Hella Brown Metal").download();
        librarian.getBook("Jane Eyre");
        //librarian.getBook("Jane Eyre");
        librarian.returnBook("Jane Eyre");
        librarian.returnBook("The Great Gatsby");
        List<Downloadable> listToDownload = new ArrayList();
        listToDownload.add(librarian.getEBook("Little Women"));
        listToDownload.add(librarian.getEBook("Alice in Wonderland"));
        listToDownload.forEach(Downloadable::download);
    }
}
