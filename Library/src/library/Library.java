package library;

import library.Librarian;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.checkBook(librarian.repository.books.get("Jane Eyre"));
        //librarian.getBook(librarian.repository.books.get("Alice in Wonderland"));
        librarian.getBook(librarian.repository.books.get("Jane Eyre"));
        librarian.returnBook(librarian.repository.books.get("Jane Eyre"));
        librarian.returnBook(librarian.repository.books.get("Jane Eyre"));
        librarian.checkAlbum(librarian.repository.albums.get("Long Ambients Two"));
        List<Downloadable> listToDownload = new ArrayList();
        listToDownload.add(librarian.getEBook(librarian.repository.ebooks.get("Robison Crusoe")));
        listToDownload.add(librarian.getAlbum(librarian.repository.albums.get("Long Ambients Two")));
        listToDownload.add(librarian.getEBook(librarian.repository.ebooks.get("Little Women")));
        listToDownload.add(librarian.getSong((Song) librarian.repository.albums.get("Hella Brown Metal")));
        listToDownload.forEach(f -> f.download());
    }
}
