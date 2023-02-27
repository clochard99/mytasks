package library;

import library.Librarian;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {

    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Repository repository = new Repository();
        librarian.checkBook(repository.book2);
        librarian.getBook(repository.book2);
        librarian.getBook(repository.book2);
        librarian.returnBook(repository.book2);
        librarian.returnBook(repository.book2);
        librarian.checkAlbum(repository.album);
        librarian.checkEBook(repository.ebook2);
        librarian.checkEBook(repository.ebook1);
        List<Downloadable> listToDownload = new ArrayList();
        listToDownload.add(librarian.getEBook(repository.ebook2));
        listToDownload.add(librarian.getAlbum(repository.album));
        listToDownload.add(librarian.getEBook(repository.ebook1));
        listToDownload.forEach(f -> f.download());
        librarian.downloadAlbum(repository.album);
    }
}
