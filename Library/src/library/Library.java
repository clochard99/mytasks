package library;

import library.Librarian;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        librarian.checkBook(librarian.repoBook.books.get("Jane Eyre"));
        librarian.checkEBook(librarian.repoEbook.ebooks.get("Robison Crusoe"));
        //librarian.getBook(librarian.repository.books.get("Alice in Wonderland"));
        librarian.getBook(librarian.repoBook.books.get("Jane Eyre"));
        librarian.returnBook(librarian.repoBook.books.get("Jane Eyre"));
        librarian.returnBook(librarian.repoBook.books.get("Jane Eyre"));
        librarian.checkAlbum(librarian.repoAlbum.albums.get("Long Ambients Two"));
        List<Downloadable> listToDownload = new ArrayList<>();
        listToDownload.add(librarian.getEBook(librarian.repoEbook.ebooks.get("Robison Crusoe")));
        listToDownload.add(librarian.getAlbum(librarian.repoAlbum.albums.get("Long Ambients Two")));
        listToDownload.add(librarian.getEBook(librarian.repoEbook.ebooks.get("Little Women")));
        listToDownload.add(librarian.getSong((Song) librarian.repoAlbum.albums.get("Hella Brown Metal")));
        listToDownload.forEach(Downloadable::download);
    }
}
