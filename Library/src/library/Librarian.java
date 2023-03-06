package library;


public class Librarian {
    private Repository repo = new Repository();

    boolean getBook(String title) {
        if(repo.getBook(title).getTitle() != null && repo.getBook(title).isAvailability()) {
            System.out.println("Sending... " + title);
            repo.getBook(title).setAvailability(false);
        }else {
            throw new NullPointerException("Now we don't have "+ title);
        }
        return false;
    }

    boolean returnBook(String title) {
        if(repo.getBook(title).getTitle() != null && !repo.getBook(title).isAvailability()) {
            System.out.println("Returning... " + title);
            repo.getBook(title).setAvailability(true);
        }
        return false;
    }

    EBook getEBook(String title) {
        if (repo.getEbook(title) != null) {
        }
        return repo.getEbook(title);
    }

    Album getAlbum(String name) {
        if (repo.getAlbum(name) != null) {
        }
        return repo.getAlbum(name);
    }

    Song getSong(String name) {
        if (repo.getAlbum(name) != null) {
        }
        return (Song) repo.getAlbum(name);
    }
}


