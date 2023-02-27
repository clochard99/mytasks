package library;


public class Librarian {

    boolean checkBook(Book book) {
        if(book.isAvailability()) {
            System.out.println("The library has " + book.getTitle() + " " + book.getAuthor());
            return true;
        } else {
            System.out.println("The library doesn't have this book = " + book.getTitle() + " " + book.getAuthor());
            return false;
        }
    }
    boolean checkEBook(EBook ebook) {
        if(ebook.isAvailability()) {
            System.out.println("The library has " + ebook.getTitle() + " " + ebook.getAuthor());
            return true;
        } else {
            System.out.println("The library doesn't have this book = " + ebook.getTitle() + " " + ebook.getAuthor());
            return false;
        }
    }
    boolean checkAlbum(Album album) {
        if(album.getAvailability() == "downloadable") {
            System.out.println("The library has " + album.getMusician() + " " + album.getName());
            return true;
        } else {
            System.out.println("The library doesn't have " + album.getMusician() + " " + album.getName());
            return false;
        }
    }
    boolean checkSong(Song song) {
        if(song.getAvailability() == "downloadable") {
            System.out.println("The library has " + song.getMusician() + " " + song.getName());
            return true;
        } else {
            System.out.println("The library doesn't have " + song.getMusician() + " " + song.getName());
            return false;
        }
    }
    void getBook(Book book) {
        if(checkBook(book)) {
            book.setAvailability(false);
            System.out.println("Giving...");
        } else {
            System.out.println("Error");
        }
    }
    void returnBook(Book book) {
        if (!checkBook(book)) {
            book.setAvailability(true);
            System.out.println("Returning..");
        } else {
            System.out.println("The system already has this " + book.getTitle() + " " + book.getAuthor());
        }
    }
    void downloadEBook(EBook ebook) {
        ebook.download();
    }
    void downloadAlbum(Album album) {
        album.download();
    }
    void downloadSong(Song song) {
        song.download();
    }
    Downloadable getEBook(EBook ebook) {
        return ebook;
    }
    Downloadable getAlbum(Album album){
        return album;
    }
    Downloadable getSong(Song song){
       return song;
    }

    }


