package library;

public class Song extends Album {

    public Song(String musician, String name) {
        super(musician, name);
    } //если не вызвать super , то все равно будет вызвано super дефолтно тогда вызывается дефолтный конструктор!
    // нужно для приведения типов = instanceOf



    @Override
    public void download() {
        System.out.println("Downloading...");
    }
}
